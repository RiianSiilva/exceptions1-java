package academy.devdojo.untitled.javacore.Gassociacao.Test;

import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Jogador;
import academy.devdojo.untitled.javacore.Gassociacao.Dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Jogador jogador02 = new Jogador("Pelé");
        Jogador jogador03 = new Jogador("Messi");
        Jogador jogador04 = new Jogador("CR7");
        Time time = new Time("Santos");

        //Um relacionamento um (time) para muitos (jogador)
        //estamos adicioando um obj time dentro de um obj jogador
        //percebemos que podemos adicionar varios jogadores em um time e um time para varios jogadores
        jogador01.setTime(time);
        jogador02.setTime(time);
        jogador03.setTime(time);
        jogador04.setTime(time);
        jogador01.imprimir();
        jogador02.imprimir();
        jogador03.imprimir();
        jogador04.imprimir();
    }
}
