package pets;

public class Main {
    public static void main(String[] args) {
        Dog chien01 = new Dog("Alvin", 9);
        Cat chat01 = new Cat("Chat1", 5);
        Animal animal01 = new Animal("Animal1", 30);
        Animal animal02 = new Animal("Animal1", 30);

        System.out.println(animal01.equals(animal02));
    }
}
