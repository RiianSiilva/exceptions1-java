package academy.devdojo.untitled.introducao;

public class Aula06EstrturaDeRepeticao03 {
    static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor
        int max = 50;
        for (int i = 0; i <= max; i++) {
            if (i > 25) {
                break; // precisa estar dentro de um switch ou loop
            }
            System.out.println(i);
        }

    }
}
