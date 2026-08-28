package Udemy_NelioAlves.Polimorfismo.exercicioFinal.Entitie;

public class Individual extends TaxPayer {

    private Double healthExpedintures;

    public Individual(String name, Double anualIncome, Double healthExpedintures) {
        super(name, anualIncome);
        this.healthExpedintures = healthExpedintures;
    }

    public Double getHealthExpedintures() {
        return healthExpedintures;
    }

    public void setHealthExpedintures(Double healthExpedintures) {
        this.healthExpedintures = healthExpedintures;
    }


    @Override
    public Double tax() {
        if (super.getAnualIncome() < 20000.00){
            return (super.getAnualIncome() * 0.15) - (healthExpedintures * 0.50);
        }
        else{
            return (super.getAnualIncome() * 0.25) - (healthExpedintures * 0.50);
        }

    }
}
