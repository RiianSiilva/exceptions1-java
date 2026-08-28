package Udemy_NelioAlves.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class basicoDeDate {
    static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // data [hora] local == hora opcional == sem fuso horario
        // data hora global == com fuso horario
        // duracao == tempo decorrido entre duas datas-horas
        // timezone (fuso horario)
        // ISO 8601 padrao de escrita para data e hora

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Pattern == padrao
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); // now = agora

        LocalDate d04 = LocalDate.parse("2005-04-12"); // parse == analisar
        LocalDateTime d05 = LocalDateTime.parse("2005-04-12T12:00");
        Instant d06 = Instant.parse("2005-04-12T12:00:00Z");
        Instant d07 = Instant.parse("2005-04-12T12:00:00-03:00");

        LocalDate d08 = LocalDate.parse("25/05/2023", fmt1);
        //LocalDate d08 = LocalDate.parse("25/05/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("25/05/2023 18:00", fmt2);
        //LocalDateTime d09 = LocalDateTime.parse("25/05/2023 18:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2012, 12, 30);
        LocalDateTime d11 = LocalDateTime.of(2026,12,31,23,59,59);

        System.out.println("LocalDate == Local : " +d01);
        System.out.println("LocalDateTime == Local : " + d02);
        System.out.println("Instant == Global : " + d03); // GMT horario de Londres, ponto zero, necessario converter para local
        System.out.println("LocalDate.parse(...) == texto para data : " + d04);
        System.out.println("LocalDateTime.parse(...) == texto para data : " + d05);
        System.out.println("Instant.parse(...) == texto para data : " + d06);
        System.out.println("Instant.parse(...) == texto para data : " + d07);
        System.out.println("LocalDate.parse(...) == usando o DateTimeFormatter para padromizar uma data com o .ofpattern(\"dd/MM/yyyy\"): " + d08);
        System.out.println("LocalDatetime.parse(...) == usando o DateTimeFormatter para padromizar uma data com o .ofpattern(\"dd/MM/yyyy HH:mm\"): " + d09);
        System.out.println("LocalDate.of(ano, mes, dia): " + d10);
        System.out.println("LocalDateTime.of(ano, mes, dia, hora, minutos, segundos): " + d11);
    }
}
