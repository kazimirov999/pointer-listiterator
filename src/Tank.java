public class Tank {
    private float fuelVolume;

    Tank(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    void reFuel(float fuelVolume) {
        if (!hasFuel()){
            System.out.println("Seems like you have to fill the car first");
        }
        this.fuelVolume += fuelVolume;
        System.out.println("Filling the car for " + fuelVolume + " litres of fuel" +
                "\nTotal fuel volume is " + this.fuelVolume + " litres now");
    }

    boolean hasFuel() {
        return fuelVolume != 0;
    }
}
