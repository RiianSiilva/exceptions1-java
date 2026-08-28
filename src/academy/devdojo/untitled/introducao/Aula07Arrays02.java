package academy.devdojo.untitled.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, long, float e double 0 ..... valores definidos caso nao declare um valor.
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "luffy";

        for (int i = 0; i < nomes.length; i++){ // length (comprimento) muda conforme o tamanho do arrays, para obter um tamanho
            System.out.println(nomes[i]);
        }


    }
}





















