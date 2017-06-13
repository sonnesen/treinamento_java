package cast;

import encapsulamento.Pessoa;
import heranca.Funcionario;

public class InstanceOfSample {

	public static void main(String[] args) {
		Pessoa pessoa = new Funcionario();
		
		if (pessoa instanceof Cliente) {
			Cliente cliente = (Cliente) pessoa;
			System.out.println("CPF: " + cliente.getCpf());
		} else if (pessoa instanceof Funcionario) {
			Funcionario funcionario = (Funcionario) pessoa;
			System.out.println("Salario: " + funcionario.getSalario());			
		} else {
			System.out.println("Objeto invalido!");
		}

	}

}
