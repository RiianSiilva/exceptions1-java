package academy.devdojo.untitled.javacore.Jmodificadorfinal.Test;

import academy.devdojo.untitled.javacore.Jmodificadorfinal.Dominio.Carro;
import academy.devdojo.untitled.javacore.Jmodificadorfinal.Dominio.Comprador;
import academy.devdojo.untitled.javacore.Jmodificadorfinal.Dominio.Ferrari;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro();
        //nao podemos acessar variaveis estaticas atraves de variaveis de referencia :
        // é uma variável que não armazena o valor do objeto diretamente, mas sim um endereço de memória que aponta para onde o objeto está guardado
        Comprador comprador1 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Rian");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari Puro Sangue");
        ferrari.imprimnir();



    }
}
