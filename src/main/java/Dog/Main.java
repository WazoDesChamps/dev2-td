package Dog;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] args){
        List<Dog> _list_of_dog = new ArrayList<>();

        _list_of_dog.add(new Dog("Medor", 9));
        _list_of_dog.add(new Dog("Rex", 15));
        _list_of_dog.add(new Dog("Milou", 3));
        _list_of_dog.add(new Dog("Rex", 15));
        _list_of_dog.add(new Dog("Milou", 3));

        feed(_list_of_dog, 10);
    }

    public static void modify (Dog myDog){
        myDog = new Dog("Milou",3);
    }

    public static void feed(List<Dog> dogs, int minWeight){
        for (Dog dog : dogs)
        if(dog.getWeight() < minWeight){
            for (int i = 0; dog.getWeight() < minWeight; i++){
                dog.eat();
            }
        }
    }


}

