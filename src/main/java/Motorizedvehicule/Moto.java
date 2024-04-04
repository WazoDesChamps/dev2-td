package Motorizedvehicule;

public class Moto extends Véhicule{
    public Moto(String brand, double maxTank, double tank){
        super(brand, maxTank, tank);
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Tank Capacity: " + maxTank + ", Current Fuel: " + tank;
    }

    public static void main(String[] args) {
        Moto moto = new Moto("Opel", 100, 50);
        System.out.println(moto.toString());
    }
}
