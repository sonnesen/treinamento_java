package com.totvs.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorDeTarefa implements Runnable {

	private Socket socket;
	private TasksServer server;
	private ExecutorService threadPool;
	private BlockingQueue<String> comandos;

	public ExecutorDeTarefa(Socket socket, ExecutorService threadPool, BlockingQueue<String> comandos, TasksServer server) {
		this.socket = socket;
		this.threadPool = threadPool;
		this.comandos = comandos;
		this.server = server;
	}

	public void run() {
		System.out.println("Executando tarefa. Cliente: " + socket.getPort());

		try (Scanner scanner = new Scanner(socket.getInputStream());
			 PrintStream outputStream = new PrintStream(socket.getOutputStream())) {
			
			while (scanner.hasNextLine()) {
				String cmd = scanner.nextLine();

				switch (cmd) {
				case "c1":
					outputStream.println("Comando c1 recebido");
					threadPool.execute(new Comando1(outputStream));
					break;
				case "c2":
					outputStream.println("Comando c2 recebido");
					threadPool.execute(new Comando2(outputStream));
					break;
				case "c3":
					outputStream.println("Comando c3 recebido");
					Future<String> futureResultWS = threadPool.submit(new Comando3(outputStream));
					Future<String> futureResultDB = threadPool.submit(new Comando4(outputStream));
					
					threadPool.submit(new Callable<Void>() {

						@Override
						public Void call() {
							System.out.println("Aguardando resposta do WS e do DB");
							try {
								String resultWS = futureResultWS.get(15, TimeUnit.SECONDS); // bloqueia execução
								String resultDB = futureResultDB.get(15, TimeUnit.SECONDS); // bloqueia execução
								outputStream.println("Resultado comando 3: " + resultWS + ", " + resultDB);
							} catch (InterruptedException | ExecutionException | TimeoutException e) {
								System.out.println("Cancelando execução do comando 3");
								outputStream.println("Timeout na execução do comando 3");
								futureResultWS.cancel(true);
								futureResultDB.cancel(true);
							}
							
							System.out.println("Execução comando 3 finalizada");
							return null;
						}
						
					});
					
					break;
				case "c4":
					comandos.put(cmd); // bloqueia execução
					outputStream.println("Comando c4 adicionaod na fila");
				case "fim":
					outputStream.println("Finalizando o servidor");
					server.stop();
					break;
				default:
					outputStream.println("Comando desconhecido");
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
