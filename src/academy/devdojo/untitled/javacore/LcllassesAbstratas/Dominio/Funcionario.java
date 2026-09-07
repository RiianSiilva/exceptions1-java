package academy.devdojo.untitled.javacore.LcllassesAbstratas.Dominio;

public abstract class Funcionario extends Pessoa { // um templete, nao podemos criar algo concreto
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calcularBonus();
    // obrigamos todas as classes que extends de funcionario a implementar/sobreescrer esse mtodo

}
