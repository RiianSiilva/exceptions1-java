package academy.devdojo.untitled.javacore.Minterfaces.dominio;

public interface DataLoader {

    // todos os atributos em uma interfance são constantes
    public static final int MAX_DATA_SIZE = 10;

    void load(); // em interface todos os mtodos sao public && abstract

    default void checkPermission(){
        System.out.println("Fazerndo checagem de permissões");
    }

    public static void retieveMaxDataSize(){
        System.out.println("Dentro do retieveMaxDataSize na interface");
    }
}
