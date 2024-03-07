package Intro;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contact> contacts;

    Phonebook(){
        this.contacts = new ArrayList<>();
    }

    public void add(Contact c){
        this.contacts.add(c);
    }

    public void display(){
        for(Contact c : this.contacts){
            System.out.println(c.getFullName() + " " + c.getPhone() + " " + c.getAdress());
        }
    }

    public void update(int numContact, String adresse, int phone){
        this.contacts.get(numContact).setAdress(adresse);
        this.contacts.get(numContact).setPhone(phone);
    }

}
