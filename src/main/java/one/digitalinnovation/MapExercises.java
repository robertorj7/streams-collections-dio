package one.digitalinnovation;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
        System.out.println("Crie um Map e execute as seguintes operações:\n");
        Map<String, String> statesMap = new HashMap<>();

        System.out.println("1- Adicione os 26 Estados Brasileiros no map, " +
                            "onde a sigla será a chave e o nome do estado o valor");
            statesMap.put("AC", "Acre");
            statesMap.put("AL", "Alagoas");
            statesMap.put("AP", "Amapa");
            statesMap.put("AM", "Amazonas");
            statesMap.put("BA", "Bahia");
            statesMap.put("CE", "Ceara");
            statesMap.put("ES", "Espirito Santo");
            statesMap.put("GO", "Goias");
            statesMap.put("MA", "Maranhao");
            statesMap.put("MT", "Mato Grosso");
            statesMap.put("MS", "Mato Grosso do Sul");
            statesMap.put("MG", "Minas Gerais");
            statesMap.put("PA", "Para");
            statesMap.put("PB", "Paraiba");
            statesMap.put("PR", "Parana");
            statesMap.put("PE", "Pernambuco");
            statesMap.put("PI", "Piaui");
            statesMap.put("RJ", "Rio de Janeiro");
            statesMap.put("RN", "Rio Grande do Norte");
            statesMap.put("RO", "Rondonia");
            statesMap.put("RR", "Roraima");
            statesMap.put("SC", "Santa Catarina");
            statesMap.put("SP", "São Paulo");
            statesMap.put("SE", "Sergipe");
            statesMap.put("TO", "Tocantins");
            System.out.println(statesMap);

        System.out.println("\n2- Remova o estado de Minas Gerais");
            statesMap.remove("MG");
            System.out.println(statesMap);

        System.out.println("\n3- Adicione o Distrito Federal");
            statesMap.put("DF", "Distrito Federal");
            System.out.println(statesMap);
        System.out.println("\n4- Verifique o tamanho do mapa");

        System.out.println("\n5- Remova o estado do Mato Grosso do Sul usando o nome");

        System.out.println("\n6- Navegue em todos os registros do map, mostrando no console o seguinte formato: NOME (SIGLA)");

        System.out.println("\n7- Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)");

        System.out.println("\n8- Verifique se o estado do Maranhão existe no map buscando por seu nome");



    }
}
