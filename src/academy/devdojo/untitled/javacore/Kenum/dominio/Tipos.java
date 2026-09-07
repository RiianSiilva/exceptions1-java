package academy.devdojo.untitled.javacore.Kenum.dominio;

public enum Tipos {
    PESSOA_JURIDICA(1, "Pessoa Juridica"),
    PESSOA_FISICA(2,"Pessoa Fisica");

    private final int VALOR; // o valor nao pode vir antes das enumeracoes
    private final String NOME_RELATORIO;
    Tipos(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public static Tipos tipoCliientePorNomeRelatorios(String nomeRelatorio){
        for (Tipos tipoCliente : values()) {
            if (tipoCliente.getNOME_RELATORIO().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
          return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }
}
