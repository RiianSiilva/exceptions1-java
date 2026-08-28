package academy.devdojo.untitled.javacore.Gassociacao.Dominio;

public class Escola {
    private String nome;
    private Professor[] professores;


    public Escola(String nome){
        this.nome = nome;

    }

    public  Escola(String nome, Professor[] professor){
        this.nome = nome;
        this.professores = professor;
    }

    public void imprimir(){
        System.out.println(this.nome);
        if (professores != null){
            for(Professor professor: professores){
                System.out.println(professor.getNome());
            }
        }
    }

    public void setEscola(String nome){
        this.nome = nome;
    }

    public String getEscola(){
        return this.nome;
    }

    public void setProfessor(Professor[] professor){
        this.professores = professor;
    }

    public Professor[] getProfessor(){
        return this.professores;
    }
}
