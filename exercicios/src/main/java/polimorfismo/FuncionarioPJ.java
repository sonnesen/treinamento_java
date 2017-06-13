package polimorfismo;

import heranca.Funcionario;

public class FuncionarioPJ extends Funcionario {
	public double pagamento() {
		System.out.println("Pagamento funcionario PJ");
		return salario;
	}
}
