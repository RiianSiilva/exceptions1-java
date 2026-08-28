package academy.devdojo.untitled.introducao;

public class aula04Operadores {
    private static boolean ps5;

    public static void main(String[] args) {
        // + - / *
        // a soma de numeros inteiros o resultado é inteiro, mudar para double
        int numero01 = 10;
        int numero02 =  20;
        int resultado = numero01+numero02;
        System.out.println(resultado);

        // % se o resto da divisao for 0 == par se for =! == impar
        int resto = 20 % 2;
        System.out.println(resto);

        // < == menor > == maior // <= menor igual >= maior igual // == igual // != diferente // sempre vao retornar valores boleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        // && (and) || (or) !
        int idade = 35;
        float salario = 3500f;
        boolean maior = idade >= 30 && salario >= 4612;
        boolean menor = idade < 30 && salario >= 3381;
        System.out.println(maior);
        System.out.println(menor);

        double valorTotal = 200;
        double valorPoupanca = 10000;
        float play = 5000;
        boolean ps5 = valorTotal > play || valorPoupanca > play;

        // = += -= *= /= %=
        double bonus = 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador; // para digitar dentro do println
        --contador;
        System.out.println(contador);
    }
}
