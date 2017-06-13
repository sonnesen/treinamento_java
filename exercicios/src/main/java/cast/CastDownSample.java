package cast;

public class CastDownSample {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		// cast up de cliente para pessoa
		Pessoa pessoa = cliente;
		
		// cast down de pessoa para cliente
		Cliente outroCliente = (Cliente) pessoa;
		
		Pessoa outraPessoa = new Pessoa();
		
		// cast down invalido de pesssoa para cliente
		Cliente meuCliente = (Cliente) outraPessoa;
		
		System.out.println(meuCliente.getTipoCliente());
	}
}
