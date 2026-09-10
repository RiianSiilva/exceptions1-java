package academy.devdojo.untitled.javacore.Npolimorfismo.testVisualizacao;

import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Computador;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Produto;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Tomate;
import academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio.CalculadoraImposto;

public class ProdutoTest3 {
    static void main(String[] args) {
        Produto produto1 = new Computador("Dell", 3000.0);
        Tomate tomate = new Tomate("Tomate Super Vermelho", 1.0);
        tomate.setDataDeValidade("12/10/2026");

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);

    }
}
