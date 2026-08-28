package Udemy_NelioAlves.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listas {
    static void main(String[] args) {
        // listas nao aceitam tipos primitivos, usar Wrapper class

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        list.add("Rian");
        list.add("Kaique");
        list.add("Kari");
        list.add("Messias");
        list.add("Neymar");
        list.add("Cr7");
        list.add("Fusca");
        list.add("Navio");

        list.add(2, "Diego");

        System.out.println(list.size());
        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println("----------------------------");

        list.remove("Rian");
        list.remove(3);
        list.removeIf(x -> x.charAt(0) == 'K'); // Predicado (Lambda)

        System.out.println(list.size());
        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println("----------------------------");

        System.out.println("IndexOF Fusca: " + list.indexOf("Fusca"));
        System.out.println("IndexOF Ferrari: " + list.indexOf("Ferrari")); // quando um item nao existe retorna -1

        System.out.println("----------------------------");

        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'N')
                .collect(Collectors.toList());

        for (String nomes : result){
            System.out.println(nomes);
        }

        System.out.println("----------------------------");

        String a = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
        String b = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println("primeiro elemento que comeca com a letra N: " + a);
        System.out.println("primeiro elemento que comeca com a letra J: " + b); // n existe

    }
}
