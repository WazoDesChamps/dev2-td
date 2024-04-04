package Motorizedvehicule;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("BMW", 30, 10);
        HybridCar hybridCar = new HybridCar("Hunday", 40, 15);
        Car car = new Car("Opel", 60, 55, 4);

        moto.ride(101);
        hybridCar.ride(401);
        car.ride(549);
    }
}
