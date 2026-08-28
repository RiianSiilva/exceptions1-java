package academy.devdojo.untitled.javacore.Csobrecargametodos.Test;

import academy.devdojo.untitled.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime =  new Anime();
        // sobrecarga de Métodos, podemos deixar opcional uma informação
        anime.init("rian", "tv", 20, "aventura");
        anime.init("rian", "tv", 20);

        anime.imprimir();
    }
}
