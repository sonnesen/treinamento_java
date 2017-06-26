package banheiro;

public class CoisaRapidaTarefa implements Runnable {

	private Banheiro banheiro;

	public CoisaRapidaTarefa(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		banheiro.fazCoisaRapida();
	}

}
