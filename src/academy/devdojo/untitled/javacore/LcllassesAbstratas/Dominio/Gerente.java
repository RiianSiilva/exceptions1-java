package academy.devdojo.untitled.javacore.LcllassesAbstratas.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprimir() {

    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.05;
    }
}
