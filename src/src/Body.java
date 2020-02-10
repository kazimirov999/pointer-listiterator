public class Body {

    private String color;
    private String bodyType;

    public String getBodyType() {
        return bodyType;
    }

    public Body(String color, String bodyType) {
        this.color = color;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
