package Udemy_NelioAlves.Composicao.Part3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String gmail;
    private LocalDate birthDate;

    private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Client() {
    }

    public Client(String name, String gmail, LocalDate birthDate) {
        this.name = name;
        this.gmail = gmail;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " (" + sdf.format(birthDate) + ") - " + gmail;
    }
}
