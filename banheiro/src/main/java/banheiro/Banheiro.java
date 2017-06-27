package banheiro;

public class Banheiro {
	
	private boolean estaSujo = true;
	
	public void fazCoisaRapida() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		
		// pegando a chave do banheiro
		synchronized (this) {
			System.out.println(nome + " entrou no banheiro");
			
			while (estaSujo) {
				esperaLimpeza(nome);
			}
			
			System.out.println(nome + " est� fazendo coisa r�pida");
			colocaEmEspera(5000);
			
			estaSujo = true;
			System.out.println(nome + " est� puxando a descarga");
			System.out.println(nome + " est� lavando as m�os");
			System.out.println(nome + " est� saindo do banheiro");
		}
	}

	private void esperaLimpeza(String convidado) {
		System.out.println(convidado + " diz: Eca. O banheiro est� sujo!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void limpa() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		
		synchronized (this) {
			System.out.println(nome + " entrou no banheiro");
			
			if (!estaSujo) {
				System.out.println(nome + ", n�o est� sujo. Saindo.");
				return;
			}
			
			System.out.println(nome + " limpando banheiro");
			estaSujo = false;
			
			colocaEmEspera(15000);
									
			System.out.println(nome + " saindo do banheiro");
			this.notifyAll();
		}
	}

	public void fazCoisaDemorada() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");

		// pegando a chave do banheiro
		synchronized (this) {			
			System.out.println(nome + " entrou no banheiro");
			
			while (estaSujo) {
				esperaLimpeza(nome);
			}
			
			System.out.println(nome + " est� fazendo coisa demorada");
			colocaEmEspera(10000);
			
			estaSujo = true;
			System.out.println(nome + " est� puxando a descarga");
			System.out.println(nome + " est� lavando as m�os");
			System.out.println(nome + " est� saindo do banheiro");
		}
	}

	private void colocaEmEspera(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
