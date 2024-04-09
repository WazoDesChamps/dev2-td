package Phone;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contact> contacts;
    List<BusinessContact> businessContacts;

    Phonebook(){
        this.contacts = new ArrayList<>();
        this.businessContacts = new ArrayList<>();
    }

    public void add(Contact c){
        this.contacts.add(c);
    }

    public void display(){
        for(Contact c : this.contacts){
            System.out.println(c.getFullName() + " " + c.getPhone() + " " + c.getAdress());
        }
        for (BusinessContact bc : this.businessContacts){
            System.out.println(bc.getCompanyName() + " " + bc.getCompanyPhone() + " " + bc.companyAdress);
        }
    }

    public void update(int numContact, String adresse, int phone){
        this.contacts.get(numContact).setAdress(adresse);
        this.contacts.get(numContact).setPhone(phone);
        this.businessContacts.get(numContact).setAdress(adresse);
        this.businessContacts.get(numContact).setPhone(phone);
    }

    public void merge(Phonebook pb){
        for(Contact c: contacts){
            pb.add(c);
        }
    }

    public void becomeProfessionel(Contact c, String companyAdress, String, String companyName, int companyPhone) throws Exception {
        if (c == null){
            throw new Exception("Le contact n'existe pas");
        }else{
            BusinessContact bc = (BusinessContact) c;

        }
    }
}
