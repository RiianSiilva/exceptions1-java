package academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] media;
    public double salario;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        double soma = 0;
        for (double i : media) {

            soma += i;

        }
        System.out.println("media: " + soma / media.length);
    }


}
