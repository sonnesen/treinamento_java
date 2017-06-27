package com.totvs.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class Comando4 implements Callable<String> {

	private PrintStream outputStream;

	public Comando4(PrintStream outputStream) {
		this.outputStream = outputStream;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Executando comando 4");

		// simulando processamento demorado em um banco de dados
		Thread.sleep(10000);
		int rnd = new Random().nextInt(100) + 1;
		
		outputStream.println("Comando 4 executado com sucesso!");
		return Integer.toString(rnd);
	}

}
