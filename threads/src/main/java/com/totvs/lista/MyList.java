package com.totvs.lista;

public class MyList {

	private String[] elements = new String[1000];
	private int index = 0;
	
	public synchronized void add(String element) {
		this.elements[index] = element;
		this.index++;
	}
	
	public int size() {
		return elements.length;
	}
	
	public String get(int index) {
		return elements[index];
	}
}
