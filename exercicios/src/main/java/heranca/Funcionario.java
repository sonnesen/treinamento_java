package heranca;

import encapsulamento.Pessoa;

public class Funcionario extends Pessoa {
	protected double salario;
	private String matricula;
	private String cargo;
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	public Funcionario(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public Funcionario() {
	
	}

	public double getSalario() {
		return salario;
	}

	public double pagamento() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;		
	}
}

class Coordenador extends Funcionario {
	Coordenador(String nome) {
		super(nome);
	}

	String equipe;
}

class Riera extends Funcionario {
	String vagaDeEstacionamento;
	Riera(String nome, String matricula) {
		super(nome, matricula);
	}	
}

class Main {
	public static void main(String[] args) {
		Riera riera = new Riera("","");
		riera.setNome("Eduardo");
		riera.salario = 1000000000000.0;
		
		// Coordenador allan = new Coordenador();
		// allan.nome = "Allan";
		Funcionario funcionario = new Funcionario("Juca");
		funcionario.salario = 1000.0;		
	}
}


