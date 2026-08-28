package academy.devdojo.untitled.javacore.Jmodificadorfinal.Dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString(){
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;

    }
}
