package academy.devdojo.untitled.javacore.Gassociacao.Test;

import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Cr7");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        for (Jogador jogador: jogadores){
            jogador.imprimir();
        }
    }
}
