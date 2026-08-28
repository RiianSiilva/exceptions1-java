package academy.devdojo.untitled.javacore.EBlocosdeinicialização.Dominio;

public class Anime {
    private String nome;
    private int[] ep;
    // 1 - alocando espaco em memoria para o objeto
    // 2 - cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicializacao é executado
    // 4 - o construtor é executado

    { // bloco de inicializacao será ativado sempre que um bjt for criado, com isso eu evito repetir os codigos nos construtures
      // Se tem algo que não pode ser esquecido em nenhum construtor, o bloco garante isso.
        System.out.println();
        System.out.println("\nBloco de inicialização");

        ep = new int[100]; // definindo o tamanho do array

        for (int i = 0; i < ep.length; i++) { // adicionando os valores
            ep[i] = i + 1;
        }

        for (int ep : this.ep) { // imprimindo os valores
            System.out.print(ep + " ");
        }
        System.out.println("\n");
    }

    public Anime(String nome) {
        System.out.println("Construtor com parâmetro nome");
        this.nome = nome;
        System.out.println(nome);
    }

    public Anime() {  //construtor
        System.out.println("Construtor");

        ep = new int[100]; // definindo o tamanho do array

        for (int i = 0; i < ep.length; i++) { // adicionando os valores
            ep[i] = i + 1;
        }

        for (int ep : this.ep) { // imprimindo os valores
            System.out.print(ep + " ");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEp() {
        return this.ep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEp(int[] ep) {
        ep = new int[10];
        this.ep = ep;

    }


}
