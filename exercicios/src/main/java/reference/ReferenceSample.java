package reference;

public class ReferenceSample {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.deposita(1_000);

		Conta outraConta = minhaConta;
		outraConta.deposita(500);

		System.out.println(minhaConta.saldo);
		System.out.println(outraConta.saldo);

		Conta conta1 = new Conta();
		conta1.titular = "Juca";
		conta1.deposita(1000);

		Conta conta2 = new Conta();
		conta2.titular = "Juca";
		conta2.deposita(1000);

		System.out.println(conta1 == conta2 ? "Iguais" : "Diferentes");
		System.out.println(conta1);
		System.out.println(conta2);

	}

}
