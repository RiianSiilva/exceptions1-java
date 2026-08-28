package Udemy_NelioAlves.ObjectToString;

import Udemy_NelioAlves.POO.Product;

public class Object {
    static void main(String[] args) {
        // O Object possui os seguintes métodos
        // getClass - retorna o tipo do objeto
        // equals - compara se o objeto é igual a outro
        // hashCode - retorna um código hash do objeto
        // toString - converte o objeto para string

        Product product = new Product("Celular Sansung", 4000, 15);
        System.out.println(product.Tostring());



    }


}
