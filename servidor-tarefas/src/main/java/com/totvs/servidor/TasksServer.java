package com.totvs.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class TasksServer {

	private ServerSocket server;
	private ExecutorService threadPool;
	
	// evitando cache
	//private volatile boolean isRunning;
	private AtomicBoolean isRunning;

	private BlockingQueue<String> comandos;
	
	public TasksServer() throws IOException {
		System.out.println("Iniciando servidor");
		server = new ServerSocket(44444);
		threadPool = Executors.newCachedThreadPool(new MyThreadFactory(Executors.defaultThreadFactory())); // newCachedThreadPool();
		isRunning = new AtomicBoolean(true);
		comandos = new ArrayBlockingQueue<>(2);
		initConsumers(2);
	}

	private void initConsumers(int qtd) {
		for (int i = 0; i < qtd; i++) {
			ConsumeTask task = new ConsumeTask(comandos);
			threadPool.execute(task);
		}
	}

	public void exec() throws IOException {
		// aguardando novos clientes
		while (isRunning.get()) {
			try {
				Socket socket = server.accept();
				System.out.println("Novo cliente aceito. Porta: " + socket.getPort());
				threadPool.execute(new ExecutorDeTarefa(socket, threadPool, comandos, this));
			} catch (Exception e) {
				System.out.println("SocketException. isRunning: " + isRunning);
			}
		}
	}
	
	public void stop() throws IOException {
		isRunning.set(false);
		server.close();
		threadPool.shutdown();
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		TasksServer server = new TasksServer();
		server.exec();
		server.stop();
	}

}
