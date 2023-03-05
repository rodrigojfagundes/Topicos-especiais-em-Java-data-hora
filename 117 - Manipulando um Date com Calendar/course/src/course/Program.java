package course;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//declarando q o SDF vai receber uma data no formato dia, mes ano, hora minutos e segundos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		
		Calendar cal = Calendar.getInstance();
		
		//CAL recebe o valor de DATA/HORA q ta no atributo D
		cal.setTime(d);
		
		//add 4 HORAS a hora q esta no atributo D
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		//pegando apenas os minutos :)
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutes" + minutes);
		
		//pegando o mes (obs o mes comeca no 0, entao tem q colocar o + 1)
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month " + month);
		
	}

}
