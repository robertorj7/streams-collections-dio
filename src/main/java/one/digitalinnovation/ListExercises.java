package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as seguintes operações:\n");
        List<String> namesList = new ArrayList<>();

        System.out.println("1- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João");
        namesList.add("Juliana");
        namesList.add("Pedro");
        namesList.add("Carlos");
        namesList.add("Larissa");
        namesList.add("João");
        System.out.println(namesList);

        System.out.println("\n2- Navegue na lista exibindo cada nome no console");
        for (String name: namesList) {
            System.out.println(name);
        }

        System.out.println("\n3- Substitua o nome Carlos por Roberto");
        namesList.set(namesList.indexOf("Carlos"), "Roberto");
        System.out.println(namesList);

        System.out.println("\n4- Retorne o nome da posição 1");
        System.out.println(namesList.get(0));

        System.out.println("\n5- Remova o nome da posição 4");
        namesList.remove(3);
        System.out.println(namesList);

        System.out.println("\n6- Remova o nome João");
        namesList.remove("João");
        System.out.println(namesList);

        System.out.println("\n7- Retorne a quantidade de itens da lista");
        System.out.println("Tamanho da Lista: " + namesList.size());

        System.out.println("\n8- Verifique se o nome Juliano existe na lista");
        System.out.println(namesList.contains("Juliano"));

        System.out.println("\n9- Crie uma nova lista com os nomes: Ismael e Rodrigo.");
        System.out.println("Adicione todos os itens da nova lista criada na lista antiga.");
        List<String> namesList2 = new ArrayList<>();
        namesList2.add("Ismael");
        namesList2.add("Rodrigo");
        for (String itemList2: namesList2) {
            namesList.add(itemList2);
        }
        System.out.println(namesList);

        System.out.println("\n10- Ordene os itens da lista por ordem alfabética");
        Collections.sort(namesList);
        System.out.println(namesList);

        System.out.println("\n11- Verifique se a lista está vazia");
        System.out.println("Lista Vazia? " + namesList.isEmpty());



    }
}
