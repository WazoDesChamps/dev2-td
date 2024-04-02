package pets;
import java.util.Random;
import java.util.Random;

public class Dog extends Animal{
    Random rand = new Random();

    private String name;
    private int weight;
    private boolean hungry = false;
    boolean injured= false;

    Dog(String name, int weight){
        super(name, weight);
    }

    public boolean isHungry() {
        return hungry;
    }

    void bark(){
        if (this.weight > 30){
            System.out.println(this.name + "WOUUUUF");
        }
        else if (this.weight < 5){
            System.out.println(this.name + "Yip yip");
        }
        else{
            System.out.println(this.name + "Wouf");
        }
    }

    void bark(int nbRepeat){
        if (nbRepeat == 0 || nbRepeat < 0){
            throw new IllegalArgumentException("Nombre non valide");
        }
        for (int i = 0; i < nbRepeat; i++){
            bark();
        }
    }

}
