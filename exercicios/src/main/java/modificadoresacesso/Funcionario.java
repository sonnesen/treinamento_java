package modificadoresacesso;

public class Funcionario {
	private String nome;
	private String cpf;

	public Funcionario(String nome) {
		this.nome = nome;
		this.cpf = "";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Funcionario(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

}
