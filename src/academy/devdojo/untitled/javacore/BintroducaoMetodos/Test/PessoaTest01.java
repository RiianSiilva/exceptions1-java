package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Rian");
        pessoa.setIdade(20);
        pessoa.imprimir();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
