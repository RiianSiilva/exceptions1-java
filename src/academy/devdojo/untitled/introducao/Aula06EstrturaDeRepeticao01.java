package academy.devdojo.untitled.introducao;

public class Aula06EstrturaDeRepeticao01 {
    static void main(String[] args) {
        // while, do while, for

        int count = 100;

        while (count <= 10) {
            System.out.println(count);
            count = count + 1;
        }

        do { //  garante um execucao, mesmo a afirmacao sendo falsa
            System.out.println("testando.... " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }























    }
}
