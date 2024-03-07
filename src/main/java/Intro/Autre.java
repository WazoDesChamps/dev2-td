package Intro;

public class Autre{
    public static void main (String[] args){
        int data = 5;
        System.out.println("La variable data vaut " + data);
        modify(data);
        System.out.println("La variable data vaut à présent " + data);
    }
    public static void modify (int i){
        i = 10;
    }
}