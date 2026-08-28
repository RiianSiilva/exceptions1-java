package academy.devdojo.untitled.introducao;

public class Aula06EstrturaDeRepeticao02 {
    static void main(String[] args) {
        //imprima todos os numeros pares den numeros

        int numero = 1000000;

        for (int i = 1; i < numero; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
