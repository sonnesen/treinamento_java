package abstrato;

import enumeracoes.TipoClienteEnum;

public class Cliente extends Pessoa {

	public static final int TIPO_CLIENTE_PF = 1;
	public static final int TIPO_CLIENTE_PJ = 2;

	private TipoClienteEnum tipoCliente;
	
	public Cliente(String nome) {
		super(nome);
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoClienteEnum getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(TipoClienteEnum tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public void imprimeAtributos() {
		System.out.println("CPF: " + super.getCpf() + "\nTipo: " + tipoCliente.getValor());

	}

}
