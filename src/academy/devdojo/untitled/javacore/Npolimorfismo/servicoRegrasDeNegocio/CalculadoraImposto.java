package academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio;

import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Computador;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Produto;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) { // instanceof = é uma instanci?
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }
    }

}
