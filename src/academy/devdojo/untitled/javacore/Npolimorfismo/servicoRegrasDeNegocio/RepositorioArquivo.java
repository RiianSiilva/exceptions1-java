package academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio;

import academy.devdojo.untitled.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Arquivo");
    }
}
