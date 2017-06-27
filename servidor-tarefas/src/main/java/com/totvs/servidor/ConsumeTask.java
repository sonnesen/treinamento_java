package com.totvs.servidor;

import java.util.concurrent.BlockingQueue;

public class ConsumeTask implements Runnable {

	private BlockingQueue<String> comandos;

	public ConsumeTask(BlockingQueue<String> comandos) {
		this.comandos = comandos;
	}

	@Override
	public void run() {
		try {
			String comando = null;
			while((comando = comandos.take()) != null) {
				System.out.println("Consumindo comando " + comando + ", " + Thread.currentThread().getName());
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
