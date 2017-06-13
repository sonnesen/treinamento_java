package polimorfismo;

import abstrato.Funcionario;

public class FuncionarioCLT extends Funcionario {

	public double pagamento() {
		System.out.println("Pagamento funcionario CLT");
		return salario;
	}
	
}
