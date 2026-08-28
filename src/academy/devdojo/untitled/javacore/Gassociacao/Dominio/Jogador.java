package academy.devdojo.untitled.javacore.Gassociacao.Dominio;

public class Jogador {
    private String nome;
    private Time time;//é necessariio referenciar a classe time desntro da classe jogador, para conseguir usar os metodos set e get, adicionar e pegar

    public void imprimir() {
        System.out.println(this.nome);
        if(time != null) { //se o time for diferente de Null, imprima o seu valor
            System.out.println(time.getNome()); //pegamos o seu valor (nome) e imprimimos
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public void setTime(Time time) { //necessario para adicionar o jogador em um time
        this.time = time;
    }

    public Time getTime() { //necessario para pegar o valor (nome) do time onde uma instancia dessa classe pertence
        return this.time;
    }
}
