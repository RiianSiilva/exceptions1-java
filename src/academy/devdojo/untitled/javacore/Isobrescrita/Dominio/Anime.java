package academy.devdojo.untitled.javacore.Isobrescrita.Dominio;

public class Anime extends Object { // toda classe é extend da classe Object que tem diversos métodos que podem ser sobrescritos
    private String nome;

    @Override // serve para dar acerteza que esta fazendo a sobreescrita de forma correta, se eu colocar o nome do metodo diferente ou nao seguir os parametros ele vai indicar erro
    public String toString(){ // toString é um metodo que retorna academy.devdojo.untitled.javacore.Isobrescrita.Dominio.Anime@8efb846 toda vez que chamamos o print, podemos sobrescrever esse metodo
        return "Anime : " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
