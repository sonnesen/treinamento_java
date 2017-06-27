package com.totvs.servidor;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyExceptionException implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Exceção thread " + t.getName() + ". Exception: " + e.getMessage());
	}

}
