package com.totvs.lista;

//import java.util.List;
//import java.util.Vector;

public class MainList {

	public static void main(String[] args) throws InterruptedException {
		MyList list = new MyList();
//		
//		List<String> list = new ArrayList<>();
//		List<String> list = Collections.synchronizedList(new ArrayList<>());
//		List<String> list = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new AddElementTask(list, i)).start();
			//list.add("Thread " + Thread.currentThread().getId() + " - " + i);
		}
		
//		Thread.sleep(2000);
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " - " + list.get(i));
			new Thread(new PrintElementTask(list));
		}

	}

}
