package Udemy_NelioAlves.POO;

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void notasMedia(double primeiroTrimestre, double segundoTrimestre, double terceiroTrimestre){
        double nota = primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
        if (nota >= 60){
            System.out.println(nota);
            System.out.println("Pass");
        } else {
            System.out.println(nota);
            System.out.println("failed");
        }
    }

}
