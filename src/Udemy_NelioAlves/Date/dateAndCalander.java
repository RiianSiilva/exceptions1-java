package Udemy_NelioAlves.Date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class dateAndCalander {
    static void main(String[] args) {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MMM", new Locale("pt", "BR"))));
        // Tudo isso para escrever o nome do mes atual HAHAHAHAHA TO LOCOOOOO!!!
        System.out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d01 = Date.from(Instant.now());
        Date d02 = Date.from(Instant.parse("2018-01-21T15:32:23Z"));

        System.out.println(sdf.format(d01));
        System.out.println(sdf.format(d02));
        System.out.println();

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(d01);
        cal2.setTime(d02);

        cal1.add(Calendar.HOUR_OF_DAY, 4);
        cal2.add(Calendar.DAY_OF_MONTH, 4);
        d01 = cal1.getTime();
        d02 = cal2.getTime();

        System.out.println(sdf.format(d01));
        System.out.println(sdf.format(d02));

        System.out.println("------------------------------");
        System.out.println("Obtendo uma unidade de tempo");
        int hours = cal1.get(Calendar.HOUR);
        int minutes = cal1.get(Calendar.MINUTE);
        int month = 1 + cal1.get(Calendar.MONTH); // o mais 1 e necessario pq comeca no 0 a lista de meses 0 == janeiro....

        System.out.println("Hour: " + hours); // hora atual MAIS 4 horas por conta do add la em cima
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);



    }
}
