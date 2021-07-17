package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExercises {
    public static void main(String[] args) {
        System.out.println("Utilizando uma lista com um objeto complexo (Cliente, por exemplo), realize as operações:\n");
            List<Client> clients = new ArrayList<>();

            clients.add(new Client("Carlos", 55));
            clients.add(new Client("Ana", 18));
            clients.add(new Client("Rute", 35));
            clients.add(new Client("Clarisse", 22));
            clients.add(new Client("Denise", 76));
            clients.add(new Client("Celio", 26));

        System.out.println("1- Transforme cada cliente em uma string com os atributos do objeto");
            System.out.println(clients.stream().map(client ->
                client.getName().concat(" - ")
                .concat(String.valueOf(client.getAge())))
                .collect(Collectors.toList()));

        System.out.println("\n2- Conte a quantidade de clientes na coleção");
            System.out.println("Quantidade: " + clients.stream().count());

        System.out.println("\n3- Filtre clientes com idade superior a 18 anos");
            System.out.println("Maiores de 18: " + clients.stream().filter(client ->
                    client.getAge() > 18).collect(Collectors.toList()));

        System.out.println("\n4- Exiba cada elemento no console");
            clients.stream().forEach(client ->
                    System.out.println(client));

        System.out.println("\n5- Retorne clientes com nome que possuem a letra C");
            System.out.println("Clientes com C: " + clients.stream().filter(client ->
                    client.getName().toLowerCase().contains("c")).collect(Collectors.toList()));

        System.out.println("\n6- Retorne se existe ao menos um cliente com a letra D");
            System.out.println("Existe cliente com letra D? " + clients.stream().anyMatch(client ->
                    client.getName().toLowerCase().contains("d")));

        System.out.println("\n7- Retorne o cliente mais velho e o mais novo da coleção");
            System.out.println("Cliente mais velho: " + clients.stream()
                    .max(Comparator.comparing(client -> client.getAge())));
            System.out.println("Cliente mais novo: " + clients.stream()
                    .min(Comparator.comparing(client -> client.getAge())));
    }
}
