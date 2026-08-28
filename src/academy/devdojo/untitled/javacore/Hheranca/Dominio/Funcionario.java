package academy.devdojo.untitled.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa {
    private double salario;


    static {
        System.out.println("Dentro do bloco static fincionario");
    }

    {
        System.out.println("Bloco de inicialização ñ static fincionario 01");
    }

    {
        System.out.println("Bloco de inicialização ñ static fincionario 02");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro de funcionario");
    }

    public Funcionario(String nome, int cpf){
        super(nome, cpf);
    }

    public Funcionario(String nome, int cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);
    }

    public void pagamento(){
        System.out.println("o funcionario"+ this.nome + "recebeu o pagamento");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
