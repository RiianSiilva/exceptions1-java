package academy.devdojo.untitled.introducao;

public class Aula06EstrturaDeRepeticao04 {
    static void main(String[] args) {
        double valor = 30000; //valor do carro
        for (int parcela = 1; parcela <= valor; parcela++) {
             double valorParcela = valor / parcela;

             if (valorParcela >= 1000){
                 System.out.println(parcela + " e " + valorParcela);

             } else {
                 break;
             }
        }

    }
}
