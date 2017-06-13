package enumeracoes;

import abstrato.Cliente;

public class TesteTipoCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setTipoCliente(TipoClienteEnum.PESSOA_FISICA);
		
		System.out.println(TipoClienteEnum.PESSOA_FISICA.getValor());
		System.out.println(TipoClienteEnum.PESSOA_JURIDICA.getValor());
	}

}
