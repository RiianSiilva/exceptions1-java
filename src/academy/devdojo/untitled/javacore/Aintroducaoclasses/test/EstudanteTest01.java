package academy.devdojo.untitled.javacore.Aintroducaoclasses.test;

import academy.devdojo.untitled.javacore.Aintroducaoclasses.Dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
    }
}
