package reference;

public class Conta {

	public double saldo;
	public String titular;

	public void deposita(double valor) {
		saldo += valor;
	}

	boolean saca(double quantia) {
		if (saldo < quantia)
			return false;
		saldo -= quantia;
		return true;
	}

	boolean transferePara(Conta favorecido, double quantia) {
		if (saldo < quantia)
			return false;
		saldo -= quantia;
		favorecido.deposita(quantia);
		return true;
	}

}
