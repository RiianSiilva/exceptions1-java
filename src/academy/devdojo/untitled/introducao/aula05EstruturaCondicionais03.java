package academy.devdojo.untitled.introducao;

public class aula05EstruturaCondicionais03 {
    static void main(String[] args) {

//        double salario = 6000;
//        String doar = "vou doar";
//        String naoDoar = "Nao vou doar";
//        // (condicao) ? verdadeiro : falso;  Operador ternário
//        String resultado = salario > 5000 ? doar : naoDoar;
//
//        System.out.println(resultado);

        double salarioAnual = 80000;
        double conta;
        if (salarioAnual <= 35000) {
            conta = (salarioAnual * 10) / 100;
        } else if (salarioAnual >= 35000 && salarioAnual <= 70000) {
            conta = (salarioAnual * 40) / 100;
        } else {
            conta = (salarioAnual * 50) / 100;
        }
        System.out.println(conta);

    }
}
