package Udemy_NelioAlves.Composicao.Part2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Filter;

public class Client {
    private String name;

    private List<Loan> loans = new ArrayList<>();

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan){
       loans.add(loan);
    }

    public List<Loan> loansInMonth(int month, int year){

        List<Loan> filter = new ArrayList<>();
        Calendar cal = Calendar.getInstance();


        for (Loan l : loans ) {

            cal.setTime(l.getDate());
            int l_year = cal.get(Calendar.YEAR);
            int l_Month = 1 + cal.get(Calendar.MONTH);

            if (year == l_year && month == l_Month){

                 filter.add(l);
            }

        }

        return filter;
    }

    public int totalLoansInMonth(int month, int year){
        return loansInMonth(month, year).size();
    }

}
