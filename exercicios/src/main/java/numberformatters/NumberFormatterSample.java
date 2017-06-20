package numberformatters;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatterSample {

	private DecimalFormat formatter;

	public NumberFormatterSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String idioma = Locale.CANADA_FRENCH.getLanguage();
		String pais = Locale.CANADA_FRENCH.getCountry();
		NumberFormatterSample numberFormatterSample = new NumberFormatterSample();
		numberFormatterSample.mostraValoresFormatados(idioma, pais);
		numberFormatterSample.mostraDecimaisFormatados();
	}

	private void mostraValoresFormatados(String idioma, String pais) {
		NumberFormat formatadorMonetario = 
				NumberFormat.getCurrencyInstance(new Locale(idioma, pais));
		NumberFormat formatadorPercentual = 
				NumberFormat.getPercentInstance(new Locale(idioma, pais));
		NumberFormat formatadorNumerico = 
				NumberFormat.getNumberInstance(new Locale(idioma, pais));

		formatadorNumerico.setMinimumIntegerDigits(2);

		double salario = 12000.0;
		float percentual = 0.12f;
		int numero = 1234;

		System.out.printf("Moeda: %s\n", formatadorMonetario.format(salario));
		System.out.printf("Percentual: %s\n", formatadorPercentual.format(percentual));
		System.out.printf("Número: %s\n\n", formatadorNumerico.format(numero));
	}

	private void mostraDecimaisFormatados() {
		formatter = new DecimalFormat();

		formatNumber("##.##", 12.345);
		//formatNumber("##.##", 12.345);
		formatNumber("0000.0000", 12.345);
		formatNumber("#.##", -12.345);

		// Positive and negative number format
		formatNumber("#.##;(#.##)", -12.735);
	}

	private void formatNumber(String pattern, double value) {
		formatter.applyPattern(pattern);
		String formattedNumber = formatter.format(value);

		System.out.println("Number:" + value + 
				", Pattern:" + pattern + 
				", Formatted Number:" + formattedNumber);
	}

}
