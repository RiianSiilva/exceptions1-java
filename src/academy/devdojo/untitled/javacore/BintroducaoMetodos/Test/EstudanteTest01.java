package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Estudante;
import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Robin";
        estudante02.idade = 32;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("-----------------------------------");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);




    }
}
