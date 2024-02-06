/**
 * Represente la classe du chien
 * @author Arthur
 */
public class Dog {

    String name;

    Dog(String name){
        this.name = name;
    }

    void bark(){
        System.out.println(name + " Wouf");
    }

    public void run(){
        System.out.println("Le chien court");
    }



}