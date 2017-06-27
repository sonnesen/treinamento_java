package com.totvs.servidor;

import java.io.PrintStream;

public class Comando2 implements Runnable {

	private PrintStream outputStream;

	public Comando2(PrintStream outputStream) {
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		System.out.println("Executando comando 2");
		
		// simulando processamento demorado
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		throw new RuntimeException("Exceção no comando 2");
		
		//outputStream.println("Comando 2 executado com sucesso!");		
	}

}
