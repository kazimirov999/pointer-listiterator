package pointer.listiterator.components;

import pointer.listiterator.BodyType;
import pointer.listiterator.Color;

public class Body {
    private Color color;
    private final BodyType type;

    public Body(Color color, BodyType type) {
        this.color = color;
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public BodyType getType() {
        return type;
    }

    public void clean() {
        System.out.println("Car body is clean");
    }

    @Override
    public String toString() {
        return "Body type=" + type +
                ", color=" + color;
    }
}
