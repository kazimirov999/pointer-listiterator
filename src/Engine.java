public class Engine {
    private float power;

    Engine(float power) {
        this.power = power;
    }

    void engage() {
            System.out.println("The car is on.");
    }

    public float getPower() {
        return power;
    }
}