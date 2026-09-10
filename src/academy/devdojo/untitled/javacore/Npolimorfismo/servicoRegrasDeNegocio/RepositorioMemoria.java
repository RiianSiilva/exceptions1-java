package academy.devdojo.untitled.javacore.Npolimorfismo.servicoRegrasDeNegocio;

import academy.devdojo.untitled.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
