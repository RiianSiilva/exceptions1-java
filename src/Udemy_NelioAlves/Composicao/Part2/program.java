package Udemy_NelioAlves.Composicao.Part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class program {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite seu nome: ");
        String name = sc.next();
        Client client = new Client(name);

        System.out.print("Quantos emprestimos deseja fazer? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("data do emprestimo dd/mm/yyyy: ");
            String dataTexto = sc.next();
            Date date = dataFormat.parse(dataTexto);

            System.out.print("Nome do livro: ");
            String book = sc.next();

            Loan loan = new Loan(date, book, false);
            client.addLoan(loan);
        }

        System.out.println("Vamos digitar: ");
        System.out.print("Mes: ");
        int month = sc.nextInt();
        System.out.print("Ano: ");
        int year = sc.nextInt();
        System.out.println("list: " + client.loansInMonth(month, year).toString());
        System.out.println("emprestimos nesse periodo: " + client.totalLoansInMonth(month, year));


    }
}
