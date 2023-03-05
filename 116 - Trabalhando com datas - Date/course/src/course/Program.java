package course;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		//colocando data no formato dia mes e ano
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//
		//colocando data no formato dia, mes, ano e hora, minuto e segundos
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//data de agora
		Date x1 = new Date();
		
		//data e hora com segundoss
		Date x2 = new Date(System.currentTimeMillis());
		
		//passando um segundo aleartorio para data
		Date x3 = new Date(0L);
		
		//mil milesegundos
		Date x4 = new Date(1000L * 60L * 60 * 5L);
		
		
		
		Date y1 = sdf1.parse("30/05/2022");
		Date y2 = sdf2.parse("30/05/2022 20:16:10");
		//data formato iso 80601 ACHO Q e isso
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("y1 " + y1);
		System.out.println("y2 "+ y2);
		
		
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		
		System.out.println("y3 " + sdf2.format(y3));
		
		//horario atual
		System.out.println("x1 " + sdf2.format(x1));
		
		//hora com segundos
		System.out.println("sx2 " + sdf2.format(x2));
		
		System.out.println("x3 " + sdf2.format(x3));
		//horario especifico
		System.out.println("x4 " + sdf2.format(x4));
		
		//Daqui para CIMA e no formato UTC		
		System.out.println("----------------------");
		
		
		System.out.println("y1 " + sdf3.format(y1));
		System.out.println("y2 " + sdf3.format(y2));
		System.out.println("y3 " + sdf3.format(y3));
		//horario atual
		System.out.println("x1 " + sdf3.format(x1));
		//hora com segundos
		System.out.println("sx2 " + sdf3.format(x2));
		//com segundos aleartorios
		System.out.println("x3 " + sdf3.format(x3));
		//horario especifico
		System.out.println("x4 " + sdf3.format(x4));
	}

}
