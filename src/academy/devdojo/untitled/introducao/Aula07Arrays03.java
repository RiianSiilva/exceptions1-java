package academy.devdojo.untitled.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {

        int[] numero = new int[3]; // esse e necessario colocar os valores usando um for ou declarar manualmente numero[0] = 1 etc...
        int[] numeros2 = {1, 2, 3, 4, 5}; // formas de declarar, tudo a mesma peste
        int[] numero3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) { // imprime os valores na tela, podemos escolher qual espaco queremos acessar
            System.out.println(numeros2[i]);
        }
        for (int num : numero3) { // imprime todos os valores na tela (Foreach) nao tem como escolher
            System.out.println(num); // precisa ser o mesmo tipo do array
        }
    }
}
