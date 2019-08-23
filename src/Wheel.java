public class Wheel {

    private float pressure;
    private int diameter;
    private boolean isWinter = false;

    Wheel() {
        this.pressure = 2.34f;
        this.diameter = 15;
    }

    Wheel(int diameter) {
        this.diameter = diameter;
        this.pressure = 2.34f;
    }

    Wheel(int diameter, boolean isWinter) {
        this.diameter = diameter;
        this.pressure = 2.34f;
        this.isWinter = isWinter;
    }

    public float getPressure() {
        return pressure;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setType(boolean areWinter) {
        this.isWinter = areWinter;
    }

    void pump(float pressure) {
        this.pressure += pressure;
        System.out.println("Pumping your wheels for " + pressure +
                "\nNow pressure is " + this.pressure);
    }
}
