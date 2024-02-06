import java.util.Random;

/**
 * Represente la classe du chien
 * @author Arthur
 */
public class Dog {
    String name;
    int weight;
    boolean hungry;
    boolean injured;

    Random rand = new Random();

    Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
        boolean hungry = false;
        boolean injured = false;
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
        int random_number = rand.nextInt(5) + 1;
        if (random_number == 5){
            System.out.println(this.name + " s'est blessé");
            hungry = true;
            this.injured = true;
        }
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

    public boolean eat(){
        if (this.hungry == false){
            throw new IllegalStateException(this.name + " n'a plus faim");
        }
        if (this.injured == true){
            System.out.println(this.name + " est rétabli !");
            this.injured = false;
        }
        return this.hungry = false;
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