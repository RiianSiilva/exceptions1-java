package academy.devdojo.untitled.javacore.Kenum.test;

import academy.devdojo.untitled.javacore.Kenum.dominio.Cliente;
import academy.devdojo.untitled.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.untitled.javacore.Kenum.dominio.Tipos;

public class ClientTest {
    static void main(String[] args) {
        Cliente cliente01 = new Cliente("Naruto",Tipos.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Goku", Tipos.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01.toString());
        System.out.println(cliente02.toString());
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        Tipos tipoCliente1 = Tipos.tipoCliientePorNomeRelatorios("Pessoa Fisica"); // buscando o tipo Enum por uma String
        System.out.println(tipoCliente1);

        Tipos tipoCliente2 = Tipos.tipoCliientePorNomeRelatorios("Pessoa");
        System.out.println(tipoCliente2);
    }
}
