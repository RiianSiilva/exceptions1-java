package academy.devdojo.untitled.javacore.Hheranca.Dominio;

public class Pessoa {
    protected String nome;
    protected int cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco static pessoa");
    }

    {
        System.out.println("Bloco de inicialização ñ static pessoa 01");
    }

    {
        System.out.println("Bloco de inicialização ñ static pessoa 02");
    }

    public Pessoa(String nome){
        System.out.println("dentro do construtor Pessoa/nome");
        this.nome = nome;
    }

    public Pessoa(String nome, int cpf){
        this(nome); //constructor chaining, Para evitar repetição de código quando há sobrecarga de construtores
        this.cpf = cpf;
    }


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() +" "+ this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
