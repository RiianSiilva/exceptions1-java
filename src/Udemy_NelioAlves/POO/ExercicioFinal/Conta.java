package Udemy_NelioAlves.POO.ExercicioFinal;

public class Conta {
    private int numeroDaConta;
    private String nome;
    private double quantidadeDeDinheiro;

    public Conta(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }


    public Conta(int numeroDaConta, String nome, double quantidadeDeDinheiro) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.quantidadeDeDinheiro = quantidadeDeDinheiro;
    }

    public double deposito(double deposito) {
        return quantidadeDeDinheiro += deposito;
    }

    public double saque(double saque){
        return quantidadeDeDinheiro -= (saque + 5.0);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Numero da conta: " +  numeroDaConta + ", Nome do titular: " + nome + ", Saldo da Conta: " + quantidadeDeDinheiro;
    }


}
