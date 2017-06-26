package banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new CoisaRapidaTarefa(banheiro), "Convidado 1");
		Thread convidado2 = new Thread(new CoisaDemoradaTarefa(banheiro), "Convidado 2");
//		Thread convidado3 = new Thread(new CoisaRapidaTarefa(banheiro), "Convidado 3");
//		Thread convidado4 = new Thread(new CoisaDemoradaTarefa(banheiro), "Convidado 4");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
//		limpeza.setDaemon(true);
		
		convidado1.start();
		convidado2.start();
		limpeza.start();
//		convidado3.start();
//		convidado4.start();
	}

}
