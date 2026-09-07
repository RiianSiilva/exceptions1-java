package academy.devdojo.untitled.javacore.Kenum.dominio;

public class Cliente {

    private String name;
    private Tipos tipos; // uma relacao tem um
    private TipoPagamento tipoPagamento;

    public Cliente(String name, Tipos tipos, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipos = tipos;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipos=" + tipos.getNOME_RELATORIO() +
                ", tipos=" + tipos.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }


}
