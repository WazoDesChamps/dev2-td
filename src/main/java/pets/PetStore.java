package pets;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    List<Animal> animals = new ArrayList<>();

    public PetStore(List<Animal> animals){
        this.animals = animals;
    }

    public PetStore(){
        this(new ArrayList<>());
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void removeAnimal(Animal a){
        animals.remove(a);
    }

    public List allDog(){
        List<Dog> dogs = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Dog){
                dogs.add((Dog) a);
            }
        }
        return dogs;
    }

    public List allCat(){
        List<Cat> cats = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Cat){
                cats.add((Cat) a);
            }
        }
        return cats;
    }

    @Override
    public String toString() {
        for (Animal a : animals){
            System.out.println(a.getName() + " "  + a.getWeight());
        }
        return "";
    }

}
