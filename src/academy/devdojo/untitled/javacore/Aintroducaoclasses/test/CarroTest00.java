package academy.devdojo.untitled.javacore.Aintroducaoclasses.test;

import academy.devdojo.untitled.javacore.Aintroducaoclasses.Dominio.Carro;

public class CarroTest00 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Insano";
        carro.ano = 2077;

        carro2.nome = "Camaro";
        carro2.modelo = "Amarelo";
        carro2.ano = 2026;

        carro = carro2;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("----------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
