package com.totvs.servidor;

import java.io.PrintStream;

public class Comando1 implements Runnable {

	private PrintStream outputStream;

	public Comando1(PrintStream outputStream) {
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		System.out.println("Executando comando 1");
		
		// simulando processamento demorado
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		outputStream.println("Comando 1 executado com sucesso!");		
	}

}
