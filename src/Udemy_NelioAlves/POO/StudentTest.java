package Udemy_NelioAlves.POO;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student("Rian");
        System.out.println("Digite as notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        student.notasMedia(nota1,nota2,nota3);



    }
}
