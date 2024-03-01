package Intro;

public class Contact {
    String name;
    String firstName;
    String adress;
    int phone;

    Contact(String name, String firstName, String adress, int phone){
        this.name = name;
        this.firstName = firstName;
        this.adress = adress;
        this.phone = phone;
    }

    /**
     * Getter
     * @return attributs
     */
    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName(){
        return this.firstName + " " + this.name;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    /**
     * Setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    void setPhone(int phone){
        this.phone = phone;
    }
}
