package academy.devdojo.untitled.javacore.Aintroducaoclasses.test;

import academy.devdojo.untitled.javacore.Aintroducaoclasses.Dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 99;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
