package academy.devdojo.untitled.javacore.Gassociacao.Test;

import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Jogador;
import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Time time = new Time("Santos");
        Jogador jogador01 = new Jogador("Neymar");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Cr7");

        Jogador[] jogadores = {jogador01, jogador02,jogador03};

        jogador01.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Time ---");
        time.imprimir();

        System.out.println("--- jogador ---");
        jogador01.imprimir();
    }
}
