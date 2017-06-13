package arrays;

import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		//int[] valores; // declarando um array de inteiros
		//int[] valores = new int[5]; // declarando e inicializando um array de inteiros com o valor padrão
		int[] valores = {1,2,3,4,5}; // declarando e inicializando um array de inteiros com valores
		//int[] valores = new int[]{1,2,3,4,5}; // declarando e inicializando um array de inteiros com valores
		//String[] listaDeNomes; // declarando um array de strings
		//int[][] valores = {{1,2},{3,4}}; // declarando e inicializando um array 2x2 
		//int[][] valores = new int[3][2]; // declarando e inicializando um array 3x2
		//int valores[][] = new int[3][2]; // declarando e inicializando um array 3x2
		//int[] valores[] = new int[3][2]; // declarando e inicializando um array 3x2
		
		//int[] valores = {1,2,3};
		System.out.printf("Tamanho = %d", valores.length); // mostrara Tamanho = 5
		
		//int[] valores = {1,2,3};
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		 
		// Metodo 2:
		//int[] valores = {1,2,3};
		for (int valor : valores) {
			System.out.println(valor);
		}
		 
		//Metodo 3:
		//int[] valores = {1,2,3};
		Arrays.stream(valores).forEach(valor -> System.out.println(valor));
		 
		//Metodo 4:
		//int[] valores = {1,2,3};
		Arrays.stream(valores).forEach(System.out::println);

	}
}
