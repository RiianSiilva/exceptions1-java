package academy.devdojo.untitled.introducao;

public class aula05EstruturaCondicionais01 {
    static void main(String[] args) {

        int idade = 20;
        boolean pode = idade >= 18;
        if (pode) {
            System.out.println("Pode Comprar!!");
        } else {
            System.out.println("nao pode");
        }

        if (pode == false) { // podemos colocar !pode == mesmo resultado
            System.out.println("Nao pode comprar!!");
        }

    }
}
