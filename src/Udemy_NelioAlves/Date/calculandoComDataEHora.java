package Udemy_NelioAlves.Date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculandoComDataEHora {
    static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        LocalDateTime minusHoursLocalDateTime = d02.minusHours(7);

        System.out.println("pastWeekLocalDateTime " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime " + nextWeekLocalDateTime);
        System.out.println("minusHoursLocalDateTime " + minusHoursLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant " + pastWeekInstant);
        System.out.println("nextWeekInstant " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay()); // para localDate usamos assim
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);

        System.out.println("Duration " + t1.toDays());
        System.out.println("Duration " + t2.toDays());
        System.out.println("Duration " + t3.toHours());
        System.out.println("Duration " + t4.toHours());
    }
}
