package academy.devdojo.untitled.javacore.Hceminario.Domonio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void imprimir(){
        System.out.println("Nome do Professor: "+ this.nome );
        System.out.println("Especialidade do Professor: "+ this.especialidade);
        if(seminarios != null){
            for(Seminario seminario : seminarios){
                System.out.println("Titulo do seminario que esse Professor Leciona: "+ seminario.getTitulo());
            }
        }
    }

    public void adicionarSeminario(Seminario[] seminarios){
        this.seminarios= seminarios;
    }
    public Seminario[] pegarSeminario(){
        return this.seminarios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }

}
