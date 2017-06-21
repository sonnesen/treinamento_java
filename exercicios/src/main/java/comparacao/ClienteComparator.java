package comparacao;

import java.util.Comparator;

import abstrato.Cliente;

public class ClienteComparator implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		String atributos1 = o1.getNome() + o1.getCpf();
		String atributos2 = o2.getNome() + o2.getCpf();
		return atributos1.compareTo(atributos2);
	}

}
