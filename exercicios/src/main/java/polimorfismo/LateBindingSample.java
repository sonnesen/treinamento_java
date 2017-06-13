package polimorfismo;

import abstrato.Funcionario;

public class LateBindingSample {

	public static void main(String[] args) {
		Controladoria controladoria = new Controladoria();
		
		Funcionario funcionarioCLT = new FuncionarioCLT();
		funcionarioCLT.setNome("Juca");
		funcionarioCLT.setSalario(2000.0);
		controladoria.geraDemonstrativo(funcionarioCLT);
		
		Funcionario funcionarioPJ = new FuncionarioPJ();
		funcionarioPJ.setNome("Asdrubal Corp");
		funcionarioPJ.setSalario(8000.0);
		controladoria.geraDemonstrativo(funcionarioPJ);
	}

}
