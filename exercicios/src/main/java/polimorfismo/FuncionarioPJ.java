package polimorfismo;

import abstrato.Funcionario;

public class FuncionarioPJ extends Funcionario {
	public double pagamento() {
		System.out.println("Pagamento funcionario PJ");
		return salario;
	}
}
