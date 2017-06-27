package com.totvs.lista;

public class PrintElementTask implements Runnable {

	private MyList list;

	public PrintElementTask(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized(list) {
			if (!list.isFull()) {
				try {
					System.out.println("Aguardando notifica��o!");
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + " - " + list.get(i));
			}
		}
	}

}
