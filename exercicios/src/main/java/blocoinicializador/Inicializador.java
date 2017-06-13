package blocoinicializador;

public class Inicializador {
	private int valor = 15;
	{
		// bloco inicializador
		System.out.println("Dentro do inicializador de instância");
		System.out.println("Valor: " + valor);
	}

	public Inicializador() {
		System.out.println("Construtor");
	}

	public static void main(String[] args) {
		Inicializador inicializador = new Inicializador();
	}
}
