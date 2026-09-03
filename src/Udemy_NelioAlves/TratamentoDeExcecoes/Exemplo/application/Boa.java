package Exemplo.application;

import Exemplo.model.Entities.Reservation;
import Exemplo.model.Exeptions.DomainExeptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Boa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainExeptions e){
            System.out.println("Error in reservation: " +  e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}

// codigo da classe ruim
//import java.util.Scanner;
//
//public class Boa {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            System.out.println("Room number: ");
//            int number = sc.nextInt();
//            System.out.print("Check-in date (dd/MM/yyyy): ");
//            Date checkIn = sdf.parse(sc.next());
//            System.out.print("Check-out date (dd/MM/yyyy): ");
//            Date checkOut = sdf.parse(sc.next());
//
//            Reservation reservation = new Reservation(number, checkIn, checkOut);
//            System.out.println("Reservation: " + reservation);
//
//            System.out.println();
//            System.out.println("enter date to update the reservation: ");
//            System.out.print("Check-in date (dd/MM/yyyy): ");
//            checkIn = sdf.parse(sc.next());
//            System.out.print("Check-out date (dd/MM/yyyy): ");
//            checkOut = sdf.parse(sc.next());
//
//            reservation.updateDates(checkIn, checkOut);
//            System.out.println("Reservation: " + reservation);
//        }
//        catch (ParseException e){
//            System.out.println("Invalid date format");
//        }
//
//        sc.close();
//
//
//        sc.close();
//    }
//}
