package com.totvs.lista;

public class MyList {

	private String[] elements = new String[1000];
	private int index = 0;
	
	public synchronized void add(String element) {
		this.elements[index] = element;
		this.index++;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		if (index == size()) {
			System.out.println("Notificando!");
			this.notify();		
		}
	}
	
	public int size() {
		return elements.length;
	}
	
	public String get(int index) {
		return elements[index];
	}

	public boolean isFull() {
		return index == elements.length;
	}
}
