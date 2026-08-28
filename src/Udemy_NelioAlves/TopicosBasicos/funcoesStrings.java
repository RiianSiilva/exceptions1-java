package Udemy_NelioAlves.TopicosBasicos;

public class funcoesStrings {
    static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s1 = original.toLowerCase(); // tudo minusculo
        String s2 = original.toUpperCase(); // tudo maiusculo
        String s3 = original.trim(); // remover espaços desnecessarios
        String s4 = original.substring(2); // deleta os dois primeiros caracteres
        String s5 = original.substring(2, 9); // seleciono um escopo para imprimir
        String s6 = original.replace('a', 'x'); // substitua as letras 'a' por 'x'
        String s7 = original.replace("abc", "xy"); // podemos substituir conjuntos

        int i = original.indexOf("bc"); //posicao que ocorre esse padrao == 1
        int j = original.lastIndexOf("bc"); // a ultima posicao que ocorre esse padrao == 17
        System.out.println();

        // split() é uma função que corta uma string, podemos definir um escopo par realizar a disão, ex... espaço

        String s8 = "Segunda Terça Quarta Quinta Sexta Sabado Domingo"; // temos o texto original, uma string
        String[] split = s8.split(" "); // utilizamos o métdo split referenciano o nome da string original, porem temos que criar um vetor de String
        String dia1 = split[0]; // criamos novas variavies Strings para receber o seu defido valor
        String dia2 = split[1]; // referenciamos cada nova String para capa posição do nosso vetor que faz referencia um dia na semana
        String dia3 = split[2]; // ele divide a palavra quando encontra um espaço, podemos definir outro caracter
        String dia4 = split[3];
        String dia5 = split[4];
        String dia6 = split[5];
        String dia7 = split[6];

        System.out.println("toLowerCase: " + s1);
        System.out.println("toUpperCase: " + s2);
        System.out.println("trim: " + s3 );
        System.out.println("substring(2): " + s4);
        System.out.println("substring(2, 9): " + s5);
        System.out.println("replace('a', 'x'): " + s6);
        System.out.println("relace(abc, xy): " + s7);
        System.out.println("indexOF: " + i);
        System.out.println("lastIndexOF: " + j);
        System.out.println();
        System.out.println(dia1);
        System.out.println(dia2);
        System.out.println(dia3);
        System.out.println(dia4);
        System.out.println(dia5);
        System.out.println(dia6);
        System.out.println(dia7);
    }
}
