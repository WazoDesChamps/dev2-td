package Motorizedvehicule;

public class HybridCar extends Véhicule{

    public HybridCar(String brand, double maxTank, double tank) {
        super(brand, maxTank, tank);
    }

    public void ride(int distance){
        System.out.println(this.brand + " roule sur: " + distance +" km");
        for (int i = 0; i < distance; i++){
            this.tank = this.tank - 0.5;
            if (this.tank == 0){
                System.out.println("Je suis en panne sèche.");
            }
        }
        System.out.println();
    }
}
