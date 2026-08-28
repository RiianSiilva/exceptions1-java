package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Funcionario;
import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.MediaDeSalario;

public class FuncionarioTest00 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();
        MediaDeSalario media = new MediaDeSalario();

        funcionario.nome = "Rian";
        funcionario.idade = 20;
        funcionario.salario = 2500;
        funcionario.imprimir();

        System.out.println("____________________");

        funcionario02.nome = "Mario";
        funcionario02.idade = 22;
        funcionario02.salario = 3000;
        funcionario02.imprimir();

        System.out.println("---------------------");

        funcionario03.nome = "kart";
        funcionario03.idade = 40;
        funcionario03.salario = 4000;
        funcionario03.imprimir();

        System.out.println("----------------------------");

        media.media(2500, 3000, 4000); // resolvendo esse problema, nos dominios criamos public double[] salario;
        // um array.... obvio
    }

}
