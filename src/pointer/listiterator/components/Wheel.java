package pointer.listiterator.components;

public class Wheel extends AbstractWheel {
    private float pressure;
    private boolean isWinter;

    public Wheel(float diameter) {
        super(diameter);
    }

    public float getPressure() {
        return pressure;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setWinter(boolean isWinter) {
        this.isWinter = isWinter;
    }

    public void pump() {
        pressure = diameter <= 1.0 ? 2.1f : (diameter <= 2.5) ? 2.7f : 3.5f;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", diameter=" + diameter +
                '}';
    }
}
