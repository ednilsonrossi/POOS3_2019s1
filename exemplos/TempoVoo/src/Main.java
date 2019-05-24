import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId dubai = ZoneId.of("Asia/Dubai");

        LocalDateTime emSP = LocalDateTime.of(2019, Month.MAY, 26, 19, 15);
        LocalDateTime emDB = LocalDateTime.of(2019, Month.MAY, 27, 22, 55);

        ZonedDateTime saidaSP = ZonedDateTime.of(emSP, saoPaulo);
        ZonedDateTime chegadaDB = ZonedDateTime.of(emDB, dubai);

        Duration duracao = Duration.between(saidaSP, chegadaDB);
        System.out.println("Duração Emirates: " + duracao);

        emSP = LocalDateTime.of(2019, Month.MAY, 26, 19, 50);
        emDB = LocalDateTime.of(2019, Month.MAY, 28, 22, 30);

        saidaSP = ZonedDateTime.of(emSP, saoPaulo);
        chegadaDB = ZonedDateTime.of(emDB, dubai);

        duracao = Duration.between(saidaSP, chegadaDB);
        System.out.println("Duração Emirates: " + duracao);

	}

}
