package excecoes;

public class ArquivoNaoEncontratoException extends Exception {

	private static final long serialVersionUID = 4879544345834875610L;

	public ArquivoNaoEncontratoException(String message, Throwable cause) {
		super("Arquivo " + message + " nao encontrado!", cause);
	}

	
}
