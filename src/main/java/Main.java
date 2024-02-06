public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour, voici mon chien: ");

        Dog medor = new Dog("Medor", 70);
        Dog milou = new Dog("Milou", 4);

        medor.run();
        medor.eat();
        medor.run();
        medor.run();

    }
}
