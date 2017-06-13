package intarfaces;

public class Leite extends Alimento {

	private int diasValidade;
	private double valorDoFrete;

	@Override
	public double getValorDoFrete() {
		return valorDoFrete;
	}

	@Override
	public void setValorDoFrete(double valorDoFrete) {
		this.valorDoFrete = valorDoFrete;
	}

	@Override
	public int getNumeroDiasValidade() {
		return diasValidade;
	}
 
}
