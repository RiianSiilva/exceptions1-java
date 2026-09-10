package academy.devdojo.untitled.javacore.Npolimorfismo.testVisualizacao;

import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Computador;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Televisao;
import academy.devdojo.untitled.javacore.Npolimorfismo.dominioModelo.Tomate;
import academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {

        Computador computador = new Computador("PC da Nasa", 5000.0);
        Tomate tomate = new Tomate("Tomate vermelho", 2.0);
        Televisao televisao = new Televisao("LG", 10000.0);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(televisao);
    }
}
