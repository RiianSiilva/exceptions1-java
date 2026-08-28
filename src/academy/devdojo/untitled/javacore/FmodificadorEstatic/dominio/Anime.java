package academy.devdojo.untitled.javacore.FmodificadorEstatic.dominio;

public class Anime {
    private String nome;
    private static int[] ep; // Um atributo estático é único na memória — todas as instâncias da classe compartilham o mesmo valor. Qualquer mudança feita por uma instância afeta todas as outras.
    // 0 - o bloco de inicialicao e executado quando a JVM carregar a classe
    // 1 - alocando espaco em memoria para o objeto
    // 2 - cada atributo de classe e criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicializacao e executado
    // 4 - o construtor e executado

    static { // bloco de inicializacao executa somente uma vez
        System.out.println("dentro bloco estatico 1");
        ep = new int[100]; // definindo o tamanho do array
        for (int i = 0; i < ep.length; i++) { // adicionando os valores
            ep[i] = i + 1;
        }
        for (int ep : Anime.ep) { // imprimindo os valores
            System.out.print(ep + " ");
        }

    }


    public Anime() { // construtor, surge para cada obj
        ep = new int[100]; // definindo o tamanho do array
        for (int i = 0; i < ep.length; i++) { // adicionando os valores
            ep[i] = i + 1;
        }

        for (int ep : Anime.ep) { // imprimindo os valores
            System.out.print(ep + " ");
        }

    }



    public String getNome() {
        return this.nome;
    }

    public int[] getEp() {
        return Anime.ep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
