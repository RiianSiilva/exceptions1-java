package Udemy_NelioAlves.Polimorfismo.exercicioFinal.Entitie;

public class Company extends TaxPayer{
    private Integer numberOfEmployeers;

    public Company(String name, Double anualIncome, Integer numberOfEmployeers) {
        super(name, anualIncome);
        this.numberOfEmployeers = numberOfEmployeers;
    }

    public Integer getNumberOfEmployeers() {
        return numberOfEmployeers;
    }

    public void setNumberOfEmployeers(Integer numberOfEmployeers) {
        this.numberOfEmployeers = numberOfEmployeers;
    }

    @Override
    public Double tax() {
        if (numberOfEmployeers <= 10){
            return super.getAnualIncome() * 0.16;
        }else {
            return super.getAnualIncome() * 0.14;
        }
    }
}
