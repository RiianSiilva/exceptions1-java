package academy.devdojo.untitled.javacore.FmodificadorEstatic.test;

import academy.devdojo.untitled.javacore.FmodificadorEstatic.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("audi", 290);

        Carro.setVelocidadeLimite(300);

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();


    }
}
