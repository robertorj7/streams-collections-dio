package one.digitalinnovation;

import java.util.ArrayList;
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
        System.out.println(namesList + "\n");

        System.out.println("2- Navegue na lista exibindo cada nome no console");
        for (String name: namesList) {
            System.out.println(name);
        }

        System.out.println("\n3- Substitua o nome Carlos por Roberto");
        namesList.set(namesList.indexOf("Carlos"), "Roberto");
        System.out.println(namesList + "\n");
    }
}
