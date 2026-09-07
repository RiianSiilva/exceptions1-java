package academy.devdojo.untitled.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DateRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no arquivo");
    }
}
