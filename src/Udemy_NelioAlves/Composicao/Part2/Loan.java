package Udemy_NelioAlves.Composicao.Part2;

import java.util.Date;

public class Loan {
    private Date date;
    private String book;
    private Boolean returned;

    public Loan() {
    }

    public Loan(Date date, String book, Boolean returned) {
        this.date = date;
        this.book = book;
        this.returned = returned;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "date=" + date +
                ", book='" + book + '\'' +
                ", returned=" + returned +
                '}';
    }
}
