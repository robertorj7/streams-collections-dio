package one.digitalinnovation;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExercises {
    public static void main(String[] args) {

        System.out.println("Crie um Set e execute as seguintes operações:");
            //Implementação HashSet
            HashSet<Integer> hashNumbers = new HashSet<>();

            //Implementação LinkedHashSet
            LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<>();

            //Implementação TreeSet
            TreeSet<Integer> treeNumbers = new TreeSet<>();

        System.out.println("1- Adicione 5 números inteiros: 3, 88, 20, 44, 3");
            hashNumbers.add(3);
            hashNumbers.add(88);
            hashNumbers.add(20);
            hashNumbers.add(44);
            hashNumbers.add(3);
            System.out.println("HashSet: " + hashNumbers);

            linkedNumbers.add(3);
            linkedNumbers.add(88);
            linkedNumbers.add(20);
            linkedNumbers.add(44);
            linkedNumbers.add(3);
            System.out.println("LinkedHashSet: " + linkedNumbers);

            treeNumbers.add(3);
            treeNumbers.add(88);
            treeNumbers.add(20);
            treeNumbers.add(44);
            treeNumbers.add(3);
            System.out.println("TreeSet: " + treeNumbers);

        System.out.println("\n2- Navegue no set exibindo cada item no console");
            System.out.println("HashSet");
            for (Integer hashItem: hashNumbers) {
                System.out.println(hashItem);
            }

            System.out.println("LinkedHashSet");
            for (Integer linkedItem: linkedNumbers) {
                System.out.println(linkedItem);
            }

            System.out.println("TreeSet");
            for (Integer treeItem: treeNumbers) {
                System.out.println(treeItem);
            }

        System.out.println("\n3- Adicione um novo número no Set: 23");
            hashNumbers.add(23);
            linkedNumbers.add(23);
            treeNumbers.add(23);

            System.out.println("HashSet: " + hashNumbers);
            System.out.println("LinkedHashSet: " + linkedNumbers);
            System.out.println("TreeSet: " + treeNumbers);

        System.out.println("\n4- Verifique o tamanho do Set");
            System.out.println("Tamanho HashSet: " + hashNumbers.size());
            System.out.println("Tamanho LinkedHashSet: " + linkedNumbers.size());
            System.out.println("Tamanho TreeSet: " + treeNumbers.size());


        System.out.println("\n5- Verifique se o Set está vazio");
            System.out.println("HashSet Vazio? " + hashNumbers.isEmpty());
            System.out.println("LinkedHashSet Vazio? " + linkedNumbers.isEmpty());
            System.out.println("TreeSet Vazio? " + treeNumbers.isEmpty());
    }
}
