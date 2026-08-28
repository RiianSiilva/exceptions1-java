package academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio;

public class MediaDeSalario {
    public void media(double... soma) {
        double soma01 = 0;

        for (double i : soma){
            soma01 += i;

        }
        System.out.println("Media de salario: " + soma01 / 3);
    }
}
