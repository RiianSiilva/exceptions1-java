package Udemy_NelioAlves.Composicao.Storage;

import java.time.LocalDate;

public class Sale {
    private LocalDate date;
    private String product;
    private Double amountQuantia;
    private Double comminsionRateTaxaDeComissao;

    public Sale() {
    }

    public Sale(LocalDate date, String product, Double amountQuantia, Double comminsionRateTaxaDeComissao) {
        this.date = date;
        this.product = product;
        this.amountQuantia = amountQuantia;
        this.comminsionRateTaxaDeComissao = comminsionRateTaxaDeComissao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmountQuantia() {
        return amountQuantia;
    }

    public void setAmountQuantia(Double amountQuantia) {
        this.amountQuantia = amountQuantia;
    }

    public Double getComminsionRateTaxaDeComissao() {
        return comminsionRateTaxaDeComissao;
    }

    public void setComminsionRateTaxaDeComissao(Double comminsionRateTaxaDeComissao) {
        this.comminsionRateTaxaDeComissao = comminsionRateTaxaDeComissao;
    }

    public Double commision(){

            return amountQuantia * (comminsionRateTaxaDeComissao / 100);

    }
}
