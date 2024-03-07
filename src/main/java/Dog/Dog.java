package Dog;

import java.util.Random;

/**
 * Represente la classe du chien
 * @author Arthur
 */
public class Dog {
    Random rand = new Random();

    private String name;
    private int weight;
    private boolean hungry = false;
    boolean injured= false;

    Dog(String name, int weight){
        setName(name);
        setWeight(weight);
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
        setWeight(weight + 1);
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

    String sound(){
        if(this.weight < 10){
            return "Yip Yip";
        }
        if (this.weight <= 30){
            return "Wouf";
        }
        else{
            return "WOUUUUF";
        }
    }

    /**
     * Check if weight is between nb1 and nb2.
     * If nb1 > nb2, it checks if weight is between nb2 and nb1.
     *
     * @param nb1 defines one end of the interval.
     * @param nb2 defines the other end of the interval.
     * @return true if dog's weight is between min(nb1, nb2) and max(nb2, nb1) (both included).
     */
    boolean isWeightBetween(int nb1, int nb2) {
        if (nb1 <= nb2) {
            return this.weight >= nb1 && nb2 >= this.weight;
        } else if (nb1 >= nb2) {
            return this.weight >= nb2 && nb1 >= this.weight;
        }
        return this.weight >= nb1 ^ nb2 <= this.weight;
    }


    public void setWeight(int weight) {
        if (weight <= 0){
            throw new IllegalStateException("Le poids doit être un entier positif !");
        }
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public void setName(String name) {
        if (name.length() < 2 || name.length() > 30){
            throw new IllegalStateException("Le nom d’un chien doit\n" +
                    "toujours comporter entre 2 et 30 caractères");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}