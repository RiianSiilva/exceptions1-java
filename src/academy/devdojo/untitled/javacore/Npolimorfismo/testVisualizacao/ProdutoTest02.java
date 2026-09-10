package academy.devdojo.untitled.javacore.Npolimorfismo.testVisualizacao;

import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Computador;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Produto;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Dell", 3000.0);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------------------");

        Produto produto2 = new Tomate("Tomate Super Vermelho", 1.0);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
