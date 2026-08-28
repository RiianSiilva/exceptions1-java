package academy.devdojo.untitled.javacore.Hceminario.Test;

import academy.devdojo.untitled.javacore.Hceminario.Domonio.Aluno;
import academy.devdojo.untitled.javacore.Hceminario.Domonio.Local;
import academy.devdojo.untitled.javacore.Hceminario.Domonio.Professor;
import academy.devdojo.untitled.javacore.Hceminario.Domonio.Seminario;

public class Relacionamento {
    static void main(String[] args) {
        Aluno Rian = new Aluno("Rian", 21);
        Aluno Diego = new Aluno("Diego", 20);
        Aluno Kaique = new Aluno("Kaique", 21);
        Aluno[] alunos = {Rian, Diego, Kaique};

        Professor Isabel = new Professor("Isabel", "Português / Ingles");

        Seminario Portugues = new Seminario("Dom Casmurro");
        Seminario Ingles = new Seminario("Verbo To Be");
        Seminario[] seminarios = {Portugues, Ingles};

        Local local = new Local("Igreja Barroca");

        Rian.adicionarSeminario(Portugues); // um aluno poderá estar em apenas um seminário
        Portugues.adicionarAluno(alunos); // um seminario poderá ter nenhum ou muitos alunos
        Isabel.adicionarSeminario(seminarios); // um professor poderá ter varios seminarios
        Portugues.adicionarLocal(local); // um seminario deve ter um local
        Ingles.adicionarLocal(local); // um seminario deve ter um local

        Rian.imprimir();
        System.out.println("--------");
        Portugues.imprimir();
        System.out.println("--------");
        Ingles.imprimir();
        System.out.println("--------");
        Isabel.imprimir();


    }
}
