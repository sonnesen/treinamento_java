package datas;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Java8DateSample {

	public static void main(String[] args) {
		
		// LocalDate, LocalTime e LocalDateTime API
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Agora: " + agora);
		
		LocalDate hoje = agora.toLocalDate();
		System.out.println("Hoje: " + hoje);
		
		Month mes = agora.getMonth();
		int dia = agora.getDayOfMonth();
		int hora = agora.getHour();
		
		System.out.printf("M�s: %s Dia: %d Hora: %d\n", mes, dia, hora);
		
		LocalDateTime umAnoDepois = agora.withDayOfMonth(dia).withYear(agora.getYear() + 1);
		System.out.println("Data futura: " + umAnoDepois);
		
		LocalDate ferias = LocalDate.of(2017, Month.JULY, 3);
		System.out.println("F�rias: " + ferias);
				
		LocalTime horaDaReunicao = LocalTime.of(9, 15);
		System.out.println("Hora da reuni�o: " + horaDaReunicao);
		
		LocalTime outraHora = LocalTime.parse("15:45:10");
		System.out.println("Outra hora : " + outraHora);
		
		LocalDateTime agoraNoJapao = LocalDateTime.now(ZoneId.of("Japan"));
		System.out.println("Agora no Jap�o: " + agoraNoJapao);
		
//		// ZonedDateTime API
		ZonedDateTime horaEmPortugal = ZonedDateTime.parse("2017-06-20T13:30:00+01:00[Portugal]");
		System.out.println("Hora em Portugal: " + horaEmPortugal);
//		
//		ZoneId zoneIdAlaska = ZoneId.of("US/Alaska");
//		System.out.println("ZoneId: " + zoneIdAlaska);
//		
		ZoneId zoneIdLocal = ZoneId.systemDefault();
		System.out.println("Zona atual: " + zoneIdLocal);
		
//		// ChronoUnit Enums
		LocalDate proximaSemana = hoje.plus(1, ChronoUnit.WEEKS);
		System.out.println("Pr�xima semana: " + proximaSemana);
		
		LocalDate proximoMes = hoje.plus(1, ChronoUnit.MONTHS);
		System.out.println("Pr�ximo m�s: " + proximoMes);
		
		LocalDate teste = LocalDate.of(2020, Month.FEBRUARY, 29);
		LocalDate resultado = teste.plus(1, ChronoUnit.YEARS);
		System.out.println(resultado);
		
		LocalDate proximoAno = hoje.plus(1, ChronoUnit.YEARS);
		System.out.println("Pr�ximo ano: " + proximoAno);
		
		LocalDate proximaDecada = hoje.plus(1, ChronoUnit.DECADES);
		System.out.println("Pr�xima d�cada: " + proximaDecada);		
		
//		// Period e Duration
		Period periodo = Period.between(proximoMes, hoje);
		System.out.println("Per�odo: " + periodo);
		
		Duration quatroHoras = Duration.ofHours(4);
		LocalTime quatroHorasDepois = agora.toLocalTime().plus(quatroHoras);
		System.out.println("Quatro horas depois: " + quatroHorasDepois);
		
		Duration duracao = Duration.between(quatroHorasDepois, agora.toLocalTime());
		System.out.println("Dura��o: " + duracao);
		
		// TemporalAdjuster API
		LocalDate proximaTercaFeira = hoje.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Pr�xima ter�a-feira: " + proximaTercaFeira);
		
		LocalDate primeiroDiaDoMesAtual = LocalDate.of(hoje.getYear(), hoje.getMonth(), 1);
		System.out.println("Primeiro dia do m�s atual: " + primeiroDiaDoMesAtual);
		
		LocalDate segundoSabadoDoMes = primeiroDiaDoMesAtual
				.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	    System.out.println("Segundo s�bado do m�s : " + segundoSabadoDoMes);
	    
//	    // Retrocompatibilidade
	    Date dataAtual = new Date();
	    
	    Instant instanteAtual = dataAtual.toInstant();
	    
	    LocalDateTime localDateTime = LocalDateTime.ofInstant(instanteAtual, zoneIdLocal);
	    System.out.println("Data local: " + localDateTime);
	    
	    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instanteAtual, zoneIdLocal);
	    System.out.println("Data local com localiza��o: " + zonedDateTime);
		
	}

}
