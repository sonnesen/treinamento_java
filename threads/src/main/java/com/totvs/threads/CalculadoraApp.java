package com.totvs.threads;

public class CalculadoraApp {

//	public static void main(String[] args) {
//		new CalculadoraApp().init();
//	}
//
//	private void init() {
//		JFrame frame = new JFrame("Multiplicação lenta");
//		
//		JTextField field1 = new JTextField(10);
//		JTextField field2 = new JTextField(10);
//		JTextField field3 = new JTextField(10);
//		
//		field3.setEditable(false);
//		
//		JButton button = new JButton(" = ");
//		JLabel label1 = new JLabel(" x ");
//		
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// maneira complicada e ineficiente de multiplicar dois números
//				
//				Runnable myTask = new MultiplicationTask(field1, field2, field3);
//				Thread thread = new Thread(myTask, "Tarefa de multiplicação");
//				thread.start();
//				
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						long fieldValue1 = Long.parseLong(field1.getText());
//						long fieldValue2 = Long.parseLong(field2.getText());
//						
//						BigInteger result = new BigInteger("0");
//						
//						for (int i = 0; i < fieldValue1; i++) {
//							for (int j = 0; j < fieldValue2; j++) {
//								result = result.add(new BigInteger("1"));
//							}
//						}
//						
//						field3.setText(result.toString());						
//					}
//				}).start();	
//			}
//		});
//		
//		JPanel panel = new JPanel();
//		panel.add(field1);
//		panel.add(label1);		
//		panel.add(field2);
//		panel.add(button);
//		panel.add(field3);
//		
//		frame.add(panel);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
//	}
//
}
