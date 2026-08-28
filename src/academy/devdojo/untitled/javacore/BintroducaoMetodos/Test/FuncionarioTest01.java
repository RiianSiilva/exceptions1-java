package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rian";
        funcionario.idade = 20;
        funcionario.media = new double[]{2500, 3000, 5000};

       funcionario.imprimir();
    }
}
