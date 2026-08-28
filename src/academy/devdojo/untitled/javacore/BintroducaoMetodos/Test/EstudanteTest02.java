package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        
        estudante01.nome = "luffy";
        estudante01.idade = 20;
        estudante01.sexo = 'M';
        
        estudante02.nome = "sanji";
        estudante02.idade = 22;
        estudante02.sexo = 'M';
        
        estudante01.imprime();
        estudante02.imprime();
        
        
    }
}
