package banheiro;

public class CoisaDemoradaTarefa implements Runnable {

	private Banheiro banheiro;

	public CoisaDemoradaTarefa(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		banheiro.fazCoisaDemorada();
	}

}
