public class Car {

    private String model;
    Wheels wheels;
    SteeringWheel steeringWheel;
    Body body;

    public Car(String model, String bodyType, int diameter, int amountButtons, int radius, String color) {
        this.model = model;
        this.wheels = new Wheels(diameter);
        this.steeringWheel = new SteeringWheel(amountButtons, radius);
        this.body = new Body(color, bodyType);

    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Body getBody() {
        return body;
    }
}
