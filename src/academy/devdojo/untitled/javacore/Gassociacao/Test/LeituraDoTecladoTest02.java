package academy.devdojo.untitled.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema milenar de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou ñ");
        String pergunta = sc.nextLine();


        // o charAt observa somente o primeiro caracter da palavra, posicao 0, para dizer que ele é igual a
        // um espaço vaziu usamos aspas simples
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
