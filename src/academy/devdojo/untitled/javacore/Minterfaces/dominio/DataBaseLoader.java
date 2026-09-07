package academy.devdojo.untitled.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DateRemover {
    // nao pode colocar um modificador de acesso mais restritivo que o mtodo q sera sobreescrito
    // private -> default -> protect -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }
}
