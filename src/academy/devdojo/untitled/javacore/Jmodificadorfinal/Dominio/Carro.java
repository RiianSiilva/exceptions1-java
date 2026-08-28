package academy.devdojo.untitled.javacore.Jmodificadorfinal.Dominio;

public class Carro { // apartir do momento q sua classe e declarada como final, ela n pode ser extanciada
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250.0; // constante é definida pela palavra final, ao executar o codigo é impossivel mudar o valor de uma constante
    public final Comprador COMPRADOR = new Comprador();

    public final void imprimnir(){ // esse métdo n pode ser subescrito, garantindo um comportamento unico
        System.out.println(this.nome);
    }

    public void setNome(String nome){
    this.nome = nome;
    }
    public String getNome(){
        return "Esse é o nome do Carro : " + this.nome;
    }
}
