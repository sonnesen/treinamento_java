package flowcontrol;

public class FlowControlSample {
	/*
	 * if
	 * if-else
	 * switch
	 **/
	public static void main(String[] args) {
		boolean isValid = true;
		
		if (!isValid) 
			System.out.println("nao e valido");
		else 	
			System.out.println("é valido");
		
		int opcao = 3;
		
		switch (opcao) {
		case 1:
			System.out.println(1);
			break;

		default:
			System.out.println("outro valor");
			break;
		}
	}
	
}
