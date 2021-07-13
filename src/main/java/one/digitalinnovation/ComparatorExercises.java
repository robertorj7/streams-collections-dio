package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExercises {
    public static void main(String[] args) {
        System.out.println("Crie uma Lista de um objeto complexo e execute as seguintes operações:\n");
            List<Client> clients = new ArrayList<>();

        System.out.println("1- Adicione elementos nesta lista");
            clients.add(new Client("Carlos", 55));
            clients.add(new Client("Ana", 18));
            clients.add(new Client("Rute", 35));
            clients.add(new Client("Clarisse", 22));
            clients.add(new Client("Denise", 76));
            clients.add(new Client("Celio", 26));
            System.out.println(clients);

        System.out.println("\n2- Ordene implementando a intervace java.util.Comparator no seu objeto complexo");
            clients.sort(Comparator.comparingInt(Client::getAge));
            System.out.println(clients);


        System.out.println("\n3- Ordene usando uma expressão lambda na chamada de suaLista.sort ");
            clients.sort((first, second) -> first.getAge() - second.getAge() );
            System.out.println(clients);

        System.out.println("\n4- Ordene de forma reversa com a interface java.util.Comparator");
            clients.sort(Comparator.comparingInt(Client::getAge).reversed());
            System.out.println(clients);
    }
}
