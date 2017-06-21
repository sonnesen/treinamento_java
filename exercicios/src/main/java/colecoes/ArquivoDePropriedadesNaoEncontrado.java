package colecoes;

public class ArquivoDePropriedadesNaoEncontrado extends Exception {

	private static final long serialVersionUID = -6526796148533504198L;

	public ArquivoDePropriedadesNaoEncontrado(String message) {
		super(message);
	}

	public ArquivoDePropriedadesNaoEncontrado(Throwable cause) {
		super(cause);
	}

	public ArquivoDePropriedadesNaoEncontrado(String message, Throwable cause) {
		super(message, cause);
	}
	

}
