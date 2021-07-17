package one.digitalinnovation;

import java.util.Optional;

public class OptionalExercises {
    public static void main(String[] args) {
        System.out.println("Crie um optional de um determinado tipo de dado:\n");

        System.out.println("1- Crie com estado vazio, estado presente e com null\n");
        Optional<String> presentOptional = Optional.of("Presente");
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nullOptional = Optional.ofNullable(null);

        System.out.println(presentOptional.get());
        System.out.println(emptyOptional);
        System.out.println(nullOptional + "\n");

        System.out.println("2- Se vazio, exiba 'Optional vazio' no console\n");
        if (emptyOptional.isEmpty()) {
            System.out.println("Optional vazio\n");
        }

        System.out.println("3- Se presente, transforme o valor e exiba no console\n");
        if (presentOptional.isPresent()) {
            System.out.println(presentOptional.of("Alterado").get());
        }

        System.out.println("4- Se presente, pegue o valor do Optional e atribua em uma variável\n");
        if (presentOptional.isPresent()) {
            String value = presentOptional.get();
            System.out.println(value);
        }
    }
}
