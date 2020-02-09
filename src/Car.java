public class Car {
    private String model;
    private String mark;
    private Body body;
    private Wheels wheels;

    public Car(String model, String mark, BodyType bodyType, CarColor carColor, WheelsType wheelsType,
               int wheelsDiameter){
        this.model = model;
        this.mark = mark;
        this.body = new Body(bodyType, carColor);
        this.wheels = new Wheels(wheelsType, wheelsDiameter);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
