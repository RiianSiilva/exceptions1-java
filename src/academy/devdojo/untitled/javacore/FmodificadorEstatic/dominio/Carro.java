package academy.devdojo.untitled.javacore.FmodificadorEstatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; // Modificador estatico é um MetaDado o Carro (class) tem esse atributo


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }


    public void imprimir() {
        System.out.println("-------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("Veocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return this.nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
}
// static = existe a possibilidade de ñ existir um obj em memoria
// o metodo static existe antes do obj, se vc tentar criar um obj antes ele simplesmente ñ funciona
