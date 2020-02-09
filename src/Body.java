public class Body {
    private BodyType bodyType;
    private CarColor carColor;

    public Body(BodyType bodyType, CarColor carColor) {
        this.bodyType = bodyType;
        this.carColor = carColor;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }
}
