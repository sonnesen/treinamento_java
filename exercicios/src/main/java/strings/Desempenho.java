package strings;

public class Desempenho {

	public static void main(String[] args) {
//		String s = "";
		
		long inicio = System.currentTimeMillis();
		long fim = 0L;
		long total = 0L;
		
		int j = 1_000_000;
//		for (int i = 0; i < j; i++) {
//			s += i;
//		}
//		fim = System.currentTimeMillis();
//		total = fim - inicio;
//		System.out.println("Tempo total: " + total);
		
		StringBuilder builder = new StringBuilder();
		inicio = System.currentTimeMillis();
		for (int i = 0; i< j; i++) {
			builder.append(i);
		}
		fim = System.currentTimeMillis();
		total = fim - inicio;
		System.out.println("Tempo total: " + total);
		
		StringBuffer sb = new StringBuffer();
		inicio = System.currentTimeMillis();
		for (int i = 0; i< j; i++) {
			sb.append(i);
		}
		fim = System.currentTimeMillis();
		total = fim - inicio;
		System.out.println("Tempo total: " + total);
		
	}

}
