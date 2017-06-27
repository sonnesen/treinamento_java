package com.totvs.buscatexto;

public class Principal {

	private static final String LISTA1_TXT = "lista1.txt";
	private static final String LISTA2_TXT = "lista2.txt";
	private static final String LISTA3_TXT = "lista3.txt";

	public static void main(String[] args) {
		/* Lista de nomes geradas em http://listofrandomnames.com */
		String parametroBusca = "Li";

		Thread thread1 = new Thread(new PesquisaNomeTarefa(LISTA1_TXT, parametroBusca));
		Thread thread2 = new Thread(new PesquisaNomeTarefa(LISTA2_TXT, parametroBusca));
		Thread thread3 = new Thread(new PesquisaNomeTarefa(LISTA3_TXT, parametroBusca));

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
