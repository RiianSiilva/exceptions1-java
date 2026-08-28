package academy.devdojo.untitled.javacore.Dconstrutores.Test;


import academy.devdojo.untitled.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime =  new Anime("One Piece", "TV", 1000, "aventura" );
        //anime.init("rian", "tv", 20, "aventura");
        anime.imprimir();
    }
}
