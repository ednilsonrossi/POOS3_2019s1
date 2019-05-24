
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) {
		
		/*TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println("Agora: " + agora);
		System.out.println("São Paulo: " + agora.plusHours(-3));
		System.out.println("Londres: " + agora.plusHours(1));
		System.out.println("Moscou: " + agora.plusHours(3));
		System.out.println("Tóquio: " + agora.plusHours(9));
		System.out.println("Alasca: " + agora.plusHours(-8));
		*/
		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId londres = ZoneId.of("Europe/London");
        ZoneId moscou = ZoneId.of("Europe/Moscow");
        ZoneId toquio = ZoneId.of("Asia/Tokyo");
        ZoneId alaska = ZoneId.of("US/Alaska");

        System.out.println("São Paulo: " + ZonedDateTime.now(saoPaulo));
        System.out.println("Londres: " + ZonedDateTime.now(londres));
        System.out.println("Moscou: " + ZonedDateTime.now(moscou));
        System.out.println("Tóquio: " + ZonedDateTime.now(toquio));
        System.out.println("Alaska: " + ZonedDateTime.now(alaska));
	}
}
