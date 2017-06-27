package com.totvs.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TasksClient {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("localhost", 44444);
		System.out.println("Conexão realizada");
		
		// Criando uma thread para enviar comando para o servidor
		Thread tarefaEnviaComando = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Enviando comandos");
				try (PrintStream outputStream = new PrintStream(socket.getOutputStream());
					Scanner scanner = new Scanner(System.in)) {
				
					while (scanner.hasNextLine()) {
						String cmd = scanner.nextLine();
					
						if (cmd.trim().equals(""))
							break;
					
						outputStream.println(cmd);			
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});		
		
		// criando thread para receber comandos
		Thread tarefaRecebeComando = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Recebendo comando do servidor");
				try (Scanner inputStream = new Scanner(socket.getInputStream())) {
					while (inputStream.hasNextLine()) {
						String cmd = inputStream.nextLine();
						System.out.println(cmd);
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});
		
		tarefaEnviaComando.start();
		tarefaRecebeComando.start();
		tarefaRecebeComando.join();
		
		System.out.println("Fechando conexão do cliente");
		socket.close();
	}

}
