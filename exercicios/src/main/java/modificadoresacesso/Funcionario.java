package modificadoresacesso;

public class Funcionario /*implements Comparable<Funcionario>*/ {
	private String nome;
	private String cpf;

	public Funcionario(String nome) {
		this.nome = nome;
		this.cpf = "";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Funcionario(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=").append(nome).append(", cpf=").append(cpf).append("]");
		return builder.toString();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Funcionario other = (Funcionario) obj;
//		if (cpf == null) {
//			if (other.cpf != null)
//				return false;
//		} else if (!cpf.equals(other.cpf))
//			return false;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}
//
//	@Override
//	public int compareTo(Funcionario o) {
//		String meusAtributos = nome + cpf;
//		String outrosAtributos = o.nome + o.cpf;
//		return meusAtributos.compareTo(outrosAtributos);
//	}

}
