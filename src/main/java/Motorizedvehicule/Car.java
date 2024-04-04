package Motorizedvehicule;

public class Car extends Véhicule{
    int nSeats;

    public Car(String brand, double maxTank, double tank, int nSeats) {
        super(brand, maxTank, tank);
        this.nSeats = nSeats;
    }

    @Override
    public String toString(){
        return "Brand: " + brand + ", Tank Capacity: " + maxTank + ", Current Fuel: " + tank + "Total seats: " + nSeats;
    }
}
