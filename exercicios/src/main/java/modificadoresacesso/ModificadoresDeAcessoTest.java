package modificadoresacesso;

public class ModificadoresDeAcessoTest {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Juca");
		
		// Nao e possivel acessar o atributo nome
		// funcionario.nome = "Juca";
	
		// Acessando o metodo publico getNome()
		System.out.println(funcionario.getNome());
	}

}

