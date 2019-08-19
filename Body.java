public class Body {
    private String color;
    private CarBrands brand;
    private Battery battery;
    private Tank tank;
    private BodyTypes type;

    public Body(String color,CarBrands brand, Tank tank, BodyTypes type) {
        this.color = color;
        this.brand=brand;
        this.battery=new Battery(100);
        this.tank=tank;
        this.type=type;
    }

    void repaint(String color) {
        setColor(color);
    }

    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", battery=" + battery +
                ", tank=" + tank +
                ", type=" + type +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarBrands getBrand() {
        return brand;
    }

    public Battery getBattery() {
        return battery;
    }

    public Tank getTank() {
        return tank;
    }

    public BodyTypes getType() {
        return type;
    }
}
