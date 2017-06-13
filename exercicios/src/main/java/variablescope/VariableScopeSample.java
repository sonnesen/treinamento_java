package variablescope;

public class VariableScopeSample {
	
	public static void main(String[] args) {
		int valor1 = 1000;
		
		{ // bloco anonimo
			int valor2 = 100;
			System.out.println(valor2);
			valor2 += 100;
			System.out.println(valor2);
			// Por que compila?
			System.out.println(valor1);
			valor1++;
			System.out.println(valor1);
		} // fim do bloco anonimo
		
		/* //nao compila 
		System.out.println(valor2);*/
		
		System.out.println(valor1);
	}
}
