package cast;

import encapsulamento.Pessoa;

public class Cliente extends Pessoa {

	public Cliente(String nome) {
		super(nome);
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
