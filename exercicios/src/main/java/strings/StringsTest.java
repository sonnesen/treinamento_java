package strings;

public class StringsTest {

	public static void main(String[] args) {
		String nome = "Juca";
		String outroNome = "Juca";
		String juca = new String("Juca");
		
		System.out.println(nome == outroNome);
		System.out.println(nome.equals(juca));
	}

}
