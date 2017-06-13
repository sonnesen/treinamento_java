package polimorfismo;

import heranca.Funcionario;

public class FuncionarioCLT extends Funcionario {

	public double pagamento() {
		System.out.println("Pagamento funcionario CLT");
		return salario;
	}
	
}
