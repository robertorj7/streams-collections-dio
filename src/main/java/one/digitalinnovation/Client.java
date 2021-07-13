package one.digitalinnovation;

public class Client implements Comparable<Client> {
    private final String name;
    private final Integer age;

    public Client (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    @Override
    public int compareTo(Client client) {
        return 0;
    }
}
