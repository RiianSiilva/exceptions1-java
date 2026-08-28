package academy.devdojo.untitled.javacore.Hceminario.Domonio;

public class Seminario {
    private String titulo;
    private  Aluno[] alunos;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public void imprimir(){
        System.out.println("Titulo do seminario: " + this.titulo );
        if (this.alunos != null){
            for(Aluno aluno: alunos){
            System.out.println("Alunos que vao realizar o seminario: " + aluno.getNome());
            }
        }
        if(this.local != null){
            System.out.println("Endereço: " + local.getEndereco());
        }
    }
    public void adicionarLocal(Local local){
        this.local = local;
    }
    public Local pegarLocal(){
        return this.local;
    }

    public void adicionarAluno(Aluno[] aluno){
        this.alunos = aluno;
    }
    public Aluno[] pegarAluno(){
        return this.alunos;
    }


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
