package cast;

public class CastUpSample {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		Pessoa pessoa = (Cliente) cliente;
		
		Pessoa juca = cliente;
		
		Pessoa zeca = new Cliente();
		
		Object objeto = (Object) cliente;
		
		Object outroObjeto = cliente;
	}
	
}
