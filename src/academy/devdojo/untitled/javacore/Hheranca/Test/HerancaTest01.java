package academy.devdojo.untitled.javacore.Hheranca.Test;

import academy.devdojo.untitled.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.untitled.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.untitled.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("xxxxxxxxxx");
        endereco.setCep("XXXXXXXXX");

        Pessoa pessoa = new Pessoa("Test", 3213);
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        System.out.println("------------");

        Funcionario funcionario = new Funcionario("Rian", 93420, 100000);
        funcionario.setEndereco(endereco);
        funcionario.imprimir();

    }
}
