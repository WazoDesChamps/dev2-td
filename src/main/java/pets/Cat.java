package pets;
import java.util.Random;
import java.util.Random;

public class Cat extends Animal{
    Random rand = new Random();

    private String name;
    private int weight;
    private boolean hungry = false;
    boolean injured= false;

    Cat(String name, int weight){
        super(name, weight);
    }

    public boolean isHungry() {
        return hungry;
    }

    void meow(){
        if (this.weight > 30){
            System.out.println(this.name + "MEOOOW");
        }
        else if (this.weight < 5){
            System.out.println(this.name + "Meow meow");
        }
        else{
            System.out.println(this.name + "Meow");
        }
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public void run(){
        if (this.injured == false){
            if (this.hungry){
                throw new IllegalStateException(this.name + " a faim.");
            }
            else{
                System.out.println(this.name + " court comme un fou !");
                hungry = true;
            }
        }
    }

    @Override
    public String sound(){
        if(this.weight < 10){
            return "Meow meow";
        }
        if (this.weight <= 30){
            return "Meow";
        }
        else{
            return "MEEOW";
        }
    }
}
