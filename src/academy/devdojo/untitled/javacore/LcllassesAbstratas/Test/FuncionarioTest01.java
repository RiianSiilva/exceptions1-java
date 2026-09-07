package academy.devdojo.untitled.javacore.LcllassesAbstratas.Test;

import academy.devdojo.untitled.javacore.LcllassesAbstratas.Dominio.Desenvolvedor;
import academy.devdojo.untitled.javacore.LcllassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 120000.0);
        gerente.calcularBonus();
        desenvolvedor.calcularBonus();
        System.out.println(desenvolvedor);
        System.out.println(gerente);

    }
}
