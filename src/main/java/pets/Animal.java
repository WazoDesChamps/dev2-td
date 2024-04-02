package pets;

import java.util.Objects;
import java.util.Random;

public class Animal {

    Random rand = new Random();
    protected String name;
    protected int weight;
    protected boolean hungry = false;
    protected boolean injured= false;

    Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.hungry = false;
        this.injured = false;
    }

    public boolean isHungry() {
        return hungry;
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
        if (this.hungry){
            this.hungry = false;
            return true;
        }
        return this.hungry;
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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight
                && hungry == animal.hungry
                && injured== animal.injured
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rand, getName(), getWeight(), isHungry(), injured);
    }

}
