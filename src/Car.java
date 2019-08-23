public class Car {
    private String name;
    private SteeringWheel steeringWheel;
    private Wheel wheels;
    private Body body;
    private Engine engine;
    private Tank tank;

    Car(String name, Engine engine, Body body, SteeringWheel steeringWheel, Wheel wheels, Tank tank) {
        this.name = name;
        this.engine = engine;
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
        this.tank = tank;
    }

    Car() {
        name = "Default";
        this.engine = new Engine(0);
        this.body = new Body("Black", "Sedan");
        this.steeringWheel = new SteeringWheel(false);
        this.wheels = new Wheel(15);
        this.tank = new Tank(100);
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public Tank getTank() {
        return tank;
    }

    void start() {
        if (tank.hasFuel()) {
            engine.engage();
        } else {
            tank.reFuel(100);
        }
    }
}