package pets;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Rex", 10);
        Animal cat1 = new Cat("Felix", 5);
        Animal cat2 = new Cat("Garfield", 20);
        Animal dog2 = new Dog("Medor", 40);
        Animal dog3 = new Dog("Rex", 10);
        Animal cat3 = new Cat("Felix", 5);

        PetStore petStore = new PetStore();
        petStore.addAnimal(dog1);
        petStore.addAnimal(dog2);
        petStore.addAnimal(dog3);
        petStore.addAnimal(cat1);
        petStore.addAnimal(cat2);
        petStore.addAnimal(cat3);

        System.out.println(petStore.allDog());
        System.out.println(petStore.allCat());
    }
}
