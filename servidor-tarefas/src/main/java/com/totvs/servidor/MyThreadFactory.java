package com.totvs.servidor;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {

	private static int counter = 1;
	private ThreadFactory defaultThreadFactory;
	
	public MyThreadFactory(ThreadFactory defaultThreadFactory) {
		this.defaultThreadFactory = defaultThreadFactory;
	}

	@Override
	public Thread newThread(Runnable r) {
		Thread t = defaultThreadFactory.newThread(r);
		t.setName("Thread Servidor Tarefas " + counter);
		counter++;
		t.setUncaughtExceptionHandler(new MyExceptionException());
		return t;
	}

}
