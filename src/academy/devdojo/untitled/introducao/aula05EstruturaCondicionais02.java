package academy.devdojo.untitled.introducao;

public class aula05EstruturaCondicionais02 {
    static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println(categoria);

    }
}
