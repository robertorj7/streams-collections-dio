package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercises {
    public static void main(String[] args) {
        System.out.println("Crie uma fila e adicione as seguintes operações:\n");
        Queue<String> namesQueue = new LinkedList<>();

        System.out.println("1- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João");
        namesQueue.add("Juliana");
        namesQueue.add("Pedro");
        namesQueue.add("Carlos");
        namesQueue.add("Larissa");
        namesQueue.add("João");
        System.out.println(namesQueue);

        System.out.println("\n2- Navegue na lista exibindo cada nome no console");
        for (String name : namesQueue) {
            System.out.println(name);
        }

        System.out.println("\n3- Retorne o primeiro item da lista, sem removê-lo");
        System.out.println(namesQueue.peek());
        System.out.println(namesQueue);

        System.out.println("\n4- Retorne o primeiro item da lista, removendo o mesmo");
        System.out.println(namesQueue.poll());
        System.out.println(namesQueue);

        System.out.println("\n5- Adicione o nome Daniel. Verifique a posição que ele assumiu na lista");
        namesQueue.add("Daniel");
        System.out.println(namesQueue);

        System.out.println("\n6- Retorne o tamanho da lista");
        System.out.println(namesQueue.size());

        System.out.println("\n7- Verifique se a lista está vazia");
        System.out.println("Lista vazia? " + namesQueue.isEmpty());

        System.out.println("\n8- Verifique se o nome Carlos está na lista");
        System.out.println(namesQueue.contains("Carlos"));
    }
}
