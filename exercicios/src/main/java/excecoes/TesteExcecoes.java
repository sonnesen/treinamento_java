package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteExcecoes {

	public static void main(String[] args) {
//		Cliente cliente = null;
//		
//		try {		
//			cliente.getCpf();
//		} catch (NullPointerException e) {
//			System.out.println("aqui");
//			//e.printStackTrace();
//		}
//		
//		//cliente.getCpf();
//		System.out.println("Fim do código");
		
		try {
			new TesteExcecoes().testeIOException();
		} catch (ArquivoNaoEncontratoException e) {
			e.printStackTrace();
		}
	}
	
	private void testeIOException() throws ArquivoNaoEncontratoException {
		String pathName = "c:\temp\teste.txt";
		File file = new File(pathName);
		
		System.out.println(file.exists());
		
		try (Scanner scanner = new Scanner(file)) {
			scanner.hasNextLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new ArquivoNaoEncontratoException(pathName, e);
		}
		
	}

}
