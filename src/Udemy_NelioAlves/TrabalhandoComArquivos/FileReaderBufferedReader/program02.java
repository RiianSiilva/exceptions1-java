package Udemy_NelioAlves.TrabalhandoComArquivos.FileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program02 {
    static void main(String[] args) {
        //processo manual
        String path = "C:\\Users\\Rian\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // uma abstracao maior deixando mais flexivel a leitura de arquivos

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
