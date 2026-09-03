package Udemy_NelioAlves.TrabalhandoComArquivos.FileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program03 {
    static void main(String[] args) {
        //processo manual
        String path = "C:\\Users\\Rian\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }

    }
}
