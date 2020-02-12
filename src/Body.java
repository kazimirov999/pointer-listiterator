import java.util.Objects;

public class Body {

    private Color color;
    private BodyType bodyType;

    public Body(Color color, BodyType bodyType) {
        this.color = color;
        this.bodyType = bodyType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return color == body.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Body{" +
                "color=" + color +
                ", bodyType=" + bodyType +
                '}';
    }
}

