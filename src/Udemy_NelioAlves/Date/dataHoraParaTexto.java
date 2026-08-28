package Udemy_NelioAlves.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHoraParaTexto {
    static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// pega o horario do pc que executa o comando
        DateTimeFormatter fmt4= DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5= DateTimeFormatter.ISO_INSTANT;

        System.out.println(d01.format(fmt1));
        System.out.println(fmt1.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d02.format(fmt2));
        System.out.println(fmt2.format(d02));
        System.out.println(d02.format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy ")));

        //o metodo Instant nao tem o .format sendo necessario fazer da maneira abaixo
        System.out.println(fmt3.format(d03));

        System.out.println("ISO_DATE_TIME " + fmt4.format(d02));
        System.out.println("ISO_INSTANT " + fmt5.format(d03));

    }
}
