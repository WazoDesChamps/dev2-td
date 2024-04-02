package Motorizedvehicule;

import java.util.Objects;

public class Véhicule {
    String brand;
    double maxTank;
    double tank;


    public Véhicule(String brand, double maxTank, double tank) {
        this.brand = brand;
        this.maxTank = maxTank;
        this.tank = maxTank;
    }

    public void fillUpGaz(){
        this.tank = maxTank;
    }

    public void ride(int distance){
        System.out.printf("Je roule sur", distance," km");
        for (int i = 0; i < distance; i++){
            this.tank = this.tank - 0.1;
            if (this.tank == 0){
                System.out.printf("Je suis en panne sèche.");
            }
        }
    }

    //Poser la question, si il faut modifier quelque chose ?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Véhicule véhicule)) return false;
        return Double.compare(maxTank, véhicule.maxTank) == 0 && Double.compare(tank, véhicule.tank) == 0 && Objects.equals(brand, véhicule.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxTank, tank);
    }
}
