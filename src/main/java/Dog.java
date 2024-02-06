/**
 * Represente la classe du chien
 * @author Arthur
 */
public class Dog {
    String name;

    int weight;
    boolean hungry;

    Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
        boolean hungry = false;
    }

    public boolean isHungry() {
        return hungry;
    }

    void bark(){
        if (this.weight > 30){
            System.out.println(this.name + " WOUUUUF");
        }
        else if (this.weight < 5){
            System.out.println(this.name + " Yip yip");
        }
        else{
            System.out.println(this.name + " Wouf");
        }
    }

    public void run(){
        if (hungry == false){
            System.out.println(this.name + " court comme un fou !");
            hungry = true;
        }
        else{
            System.out.println(this.name + " a faim.");
        }
    }

    public boolean eat(){
        return hungry = false;
    }
}