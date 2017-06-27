package com.totvs.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class Comando3 implements Callable<String> {

	private PrintStream outputStream;

	public Comando3(PrintStream outputStream) {
		this.outputStream = outputStream;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Executando comando 3");

		// simulando processamento demorado em um webservice
		Thread.sleep(15000);
		int rnd = new Random().nextInt(100) + 1;
		
		outputStream.println("Comando 3 executado com sucesso!");
		return Integer.toString(rnd);
	}

}
