package Dog;

public class Main{
    public static void main (String[] args){
        Dog médor = new Dog ("Médor", 5);
        feed(médor, 10);
    }
    public static void modify (Dog myDog){
        myDog = new Dog("Milou",3);
    }

    public static void feed(Dog mydog, int minWeight){
        if(mydog.getWeight() < minWeight){
            for (int i = 0; mydog.getWeight() < minWeight; i++){
                mydog.eat();
            }
        }

    }
}

