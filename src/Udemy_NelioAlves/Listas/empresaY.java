package Udemy_NelioAlves.Listas;

import java.util.*;

public class empresaY {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de funcionarios: ");
        int n = sc.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n ; i++){
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("ID: ");
            int ID = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(ID, nome, salario));
            System.out.println();
        }

        System.out.print("Digite o ID do funcionario que vai receber um aumento no salario: ");
        int escolherID = sc.nextInt();
        Integer pos = posicao(funcionarios, escolherID);

        if (pos == null){
            System.out.println("Item nao registrado");
        }
        else {

            System.out.print("Qual porcentagem? ");
            double porcentagem = sc.nextDouble();
            funcionarios.get(pos).aumentoSalarial(porcentagem);
        }

        for (Funcionario x : funcionarios){
            System.out.println(x.toString());
        }

    }

    public static Integer posicao(List<Funcionario> funcionario, int ID){
        for (int i = 0; i < funcionario.size(); i++){
            if (funcionario.get(i).getId() == ID){
                return i;
            }
        }
        return null;
    }
}
