package boxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingSample {
	
	public static void main(String[] args) {
		// unboxing
		Integer valor1 = new Integer(10);
		Integer valor2 = new Integer(20);
	
		int soma = valor1 + valor2;
		System.out.println("valor1 + valor2 = " + soma);
		
		// autoboxing
		Boolean isValid = true;
		System.out.println(isValid.getClass().getCanonicalName());
		System.out.println(isValid);
		System.out.println(isValid.booleanValue());
		
		List<Integer> valores = new ArrayList<>();
		valores.add(1);
		valores.add(new Integer(10));
		// valores.add(new Byte(10)); // não compila
		
		// Sem generics
		List teste = new ArrayList();
		teste.add(10);
		teste.add(new Integer(20));
		teste.add(new Byte((byte) 100));
		
		for (Object object : teste) {
			System.out.println(((Integer) object).intValue()); // erro java.lang.ClassCastException Byte -> Integer
		}
	}
}
