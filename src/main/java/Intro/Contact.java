package Intro;

public class Contact {
    private String name;
    private String firstName;
    private String adress;
    private int phone;

    Contact(String name, String firstName, String adress, int phone){
        setName(name);
        setFirstName(firstName);
        setAdress(adress);
        setPhone(phone);
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
        if (name.length() < 2 ){
            throw new IllegalStateException("Le nom doit comporter au moins 2 caractères.");
        }
        this.name = name;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2 ){
            throw new IllegalStateException("Le firstName doit comporter au moins 2 caractères.");
        }
        this.firstName = firstName;
    }

    public void setAdress(String adress) {
        if (adress.length() < 2 ){
            throw new IllegalStateException("L'adresse doit comporter au moins 2 caractères.");
        }
        this.adress = adress;
    }

    void setPhone(int phone){
        if (count_number(phone) < 4){
            throw new IllegalStateException("Le numéro de téléphone doit comporter au moins 4 chiffres.");
        }
        this.phone = phone;
    }



    public static int count_number(int x){
        int cpt = 0;
        while (x != 0){
            ++cpt;
        }
        return cpt;
    }

}
