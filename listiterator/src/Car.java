public class Car {

    private String brand;
    private int maxSpeed;
    private int motorVolume;

    public Body body;
    public Wheel wheels;
    public SteeringWheel steeringWheel;

    public Car(String brand, String color, String bodyType, int diameter) {
        this.brand = brand;
        this.maxSpeed = 240;
        this.motorVolume = 1998;
        this.body = new Body(color, bodyType);
        this.wheels = new Wheel(diameter, 2.0);
        this.steeringWheel = new SteeringWheel();
    }

    public void сhangeWheels(int diameter){
        this.wheels = new WinterWheels(diameter, 1.5);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(int motorVolume) {
        this.motorVolume = motorVolume;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int buttons) {
        this.steeringWheel = new SteeringWheel();
    }

    @Override
    public String toString() {
        return "Автомобіль марки ---------> " + brand + "\n" + wheels.toString() + body.toString();
    }
}
