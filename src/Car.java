public class Car {
    private String name;
    private SteeringWheel steeringWheel;
    private Wheel wheels;
    private Body body;
    private Engine engine;

    Car(String name, Engine engine, Body body, SteeringWheel steeringWheel, Wheel wheels) {
        this.name = name;
        this.engine = engine;
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.wheels = wheels;
    }

    Car() {
        name = "Unknown";
        this.engine = new Engine(0, 100);
        this.body = new Body("Black", "Sedan");
        this.steeringWheel = new SteeringWheel(false);
        this.wheels = new Wheel(15);
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

    void start() {
        engine.engage();
    }
}