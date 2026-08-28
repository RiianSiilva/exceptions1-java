package Udemy_NelioAlves.Listas;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }

    public void aumentoSalarial(double porcentagem){
         salario += salario * porcentagem / 100;
    }

    public String toString(){
        return "ID: " + id + ", Nome: " + nome + ", Salario: " + salario;
    }


}
