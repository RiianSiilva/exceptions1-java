package academy.devdojo.untitled.javacore.Hheranca.Test;

import academy.devdojo.untitled.javacore.Hheranca.Dominio.Funcionario;
// 0 - o bloco de inicialicao static da superclasse é executado quando a JVM carregar a classe pai
// 1 - o bloco de inicialicao static da subclasse é executado quando a JVM carregar a classe filha
// 2 - alocando espaco em memoria para o objeto da superclasse
// 3 - cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da superclasse
// 4 - bloco de inicializacao da superclasse è executado na ordem em que aparece
// 5 - o construtor e executado da superclasse
// 6 - alocando espaco em memoria para o objeto da subclasse
// 7 - cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
// 8 - bloco de inicializacao da subclasse è executado na ordem em que aparece
// 9 - o construtor e executado da subclasse
public class HereancaTest02 {
    static void main(String[] args) {
        Funcionario func = new Funcionario("Rian");
    }
}
