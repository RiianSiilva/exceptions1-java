package Udemy_NelioAlves.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateGlobalParaDateLocal {
    static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Egypt"));

        System.out.println(r1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(r2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d01: " + d01.getDayOfYear());
        System.out.println("d01: " + d01.getDayOfWeek());
        System.out.println("d01: " + d01.getDayOfMonth());

        System.out.println("d02: " + d02.getHour());
        System.out.println("d02: " + d02.getMinute());
        System.out.println("d02: " + d02.getSecond());
        //ZoneId.getAvailableZoneIds(); usando um for imprime todos os zoneIDs
    }
}
