package polimorfismo;

import abstrato.Funcionario;

public class Controladoria {

	public void geraDemonstrativo(Funcionario funcionario) {
		System.out.printf("O funcionario %s recebeu a quantia de R$ %.2f.\n", funcionario.getNome(),
				funcionario.pagamento());
	}
}
