package com.totvs.banco;

public class Principal {

	public static void main(String[] args) {
//		ConnectionManager connectionManager = new ConnectionManager();
//		TransactionManager transactionManager = new TransactionManager();
//		
//		new Thread(() -> {
//			synchronized (connectionManager) {
//				System.out.println("Cliente 1 obteve acesso ao pool de conex�es");
//				connectionManager.getConnection();
//				
//				synchronized (transactionManager) {
//					System.out.println("Cliente 1 obteve acesso ao pool de transa��es");
//					transactionManager.begin();
//				}
//			}
//		}).start();
//		
//		new Thread(() -> {
//			synchronized (transactionManager) {
//				System.out.println("Cliente 2 obteve acesso ao pool de transa��es");
//				transactionManager.begin();
//				
//				synchronized (connectionManager) {
//					System.out.println("Cliente 2 obteve acesso ao pool de conex�es");
//					connectionManager.getConnection();
//				}
//			}			
//		}).start();
	}
}
