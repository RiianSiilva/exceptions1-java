package academy.devdojo.untitled.javacore.Gassociacao.Dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) { //metodo que roda na criação do objeto para já deixá-lo pronto pra uso.
        this.nome = nome;      //para definir valores iniciais para um objeto, nesse caso_todo objeto time precisa de um nome
    }

    public Time(String nome, Jogador[] jogadores){
        this.nome = nome;
        this.jogadores = jogadores;

    }

    public void imprimir(){
        System.out.println(this.nome);
        if (jogadores != null){
            for (Jogador jogador: jogadores){
                System.out.println(jogador.getNome());
            }
        }
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores(){
        return jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }//metodo usado para mudar um valor dentro do objeto

    public String getNome() {
        return this.nome;
    }//metodo para obter o valor de um atributo

}
