package com.totvs.threads;

import java.math.BigInteger;

import javax.swing.JTextField;

public class MultiplicationTask implements Runnable {

	private JTextField field1;
	private JTextField field2;
	private JTextField field3;

	public MultiplicationTask(JTextField field1, JTextField field2, JTextField field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	@Override
	public void run() {
		long fieldValue1 = Long.parseLong(field1.getText());
		long fieldValue2 = Long.parseLong(field2.getText());

		BigInteger result = new BigInteger("0");

		for (int i = 0; i < fieldValue1; i++) {
			for (int j = 0; j < fieldValue2; j++) {
				result = result.add(new BigInteger("1"));
			}
		}

		field3.setText(result.toString());
	}

}
