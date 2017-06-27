package com.totvs.lista;

public class AddElementTask implements Runnable {

	private MyList list;
//	private List<String> list;
	private int threadNumber;

	public AddElementTask(MyList list, int threadNumber) {
		this.list = list;
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			list.add("Thread " + threadNumber + " - " + i);
		}
	}

}
