package Udemy_NelioAlves.Composicao;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }

    public Double getValuePerhHur() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValuePerhHur(Double valuePerhHur) {
        this.valuePerHour = valuePerhHur;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

}
