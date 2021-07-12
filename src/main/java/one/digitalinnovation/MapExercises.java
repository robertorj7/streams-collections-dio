package one.digitalinnovation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
        System.out.println("Crie um Map e execute as seguintes operações:\n");
        Map<String, String> statesMap = new HashMap<>();

        System.out.println("1- Adicione os 26 estados Brasileiros no map, " +
                            "onde a sigla será a chave e o nome do estado o valor");

        System.out.println(statesMap);

        System.out.println("\n2- Remova o estado de Minas Gerais");


        System.out.println("\n3- Adicione o Distrito Federal");

        System.out.println("\n4- Verifique o tamanho do mapa");

        System.out.println("\n5- Remova o estado do Mato Grosso do Sul usando o nome");

        System.out.println("\n6- Navegue em todos os registros do map, mostrando no console o seguinte formato: NOME (SIGLA)");

        System.out.println("\n7- Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)");

        System.out.println("\n8- Verifique se o estado do Maranhão existe no map buscando por seu nome");



    }
}
