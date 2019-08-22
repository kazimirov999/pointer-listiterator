public class Body {

    private Colors color;
    private final BodyTypes type;

    Body(String color, String bodyType) {
        this.color = Colors.valueOf(color.toUpperCase());
        this.type = BodyTypes.valueOf(bodyType.toUpperCase());
    }

    public Colors getColor() {
        return color;
    }

    public BodyTypes getType() {
        return type;
    }

    void clean() {
        System.out.println("Your " + color.toString() + " car is washed");
    }
}