package academy.devdojo.untitled.javacore.Hceminario.Domonio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("idade do aluno: " + this.idade);
        if (seminario != null){
            System.out.println("Titulo do seminario: "+seminario.getTitulo());
        }
    }

    public void adicionarSeminario(Seminario seminario){
      this.seminario = seminario;
    }
    public Seminario pegarSeminario(){
        return this.seminario;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
