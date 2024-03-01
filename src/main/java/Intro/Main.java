package Intro;

public class Main {
    public static void main(String[] args) {

        Dog medor = new Dog("Medor", 70);
        Dog milou = new Dog("Milou", 4);

        Contact moi = new Contact("Albert", "Einstein", "rue dAilleurs", 12345);
        Contact unAutre = new Contact("Mahatma", "Gandhi", "rue dAutre Part", 54321);
        Phonebook annuaire = new Phonebook();
        annuaire.add(moi);
        annuaire.add(unAutre);
        annuaire.add(new Contact("Nelson", "Mendela", "Avenue leau de là", 123321));
        annuaire.display();
    }

}
