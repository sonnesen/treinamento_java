package enumeracoes;

public enum TipoClienteEnum {
	PESSOA_FISICA(1, "PF"), PESSOA_JURIDICA(2,"PJ");
	
	private int valor;
	private String sigla;

	TipoClienteEnum(int valor, String sigla) {
		this.valor = valor;
		this.sigla = sigla;		
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getSigla() {
		return sigla;
	}
}
