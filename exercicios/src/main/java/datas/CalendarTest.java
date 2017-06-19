package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(today));

		DateFormat dfFranca = 
				DateFormat.getDateInstance(DateFormat.FULL, 
				new Locale(Locale.FRANCE.getLanguage(),
						Locale.FRANCE.getCountry()));
		
		DateFormat dfCanada = 
				DateFormat.getDateInstance(DateFormat.FULL, 
				new Locale(Locale.CANADA.getLanguage(),
						Locale.CANADA.getCountry()));
		
		DateFormat dfAlemanha = 
				DateFormat.getDateInstance(DateFormat.FULL, 
				new Locale(Locale.GERMANY.getLanguage(),
						Locale.GERMANY.getCountry()));
		
		System.out.println(dfFranca.format(today));
		System.out.println(dfCanada.format(today));
		System.out.println(dfAlemanha.format(today));
		
	}

}
