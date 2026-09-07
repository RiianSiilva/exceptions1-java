package academy.devdojo.untitled.javacore.Minterfaces.test;

import academy.devdojo.untitled.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.untitled.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();

        System.out.println();

        fileLoader.load();
        fileLoader.remove();

        System.out.println();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }

}
