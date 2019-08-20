package pointer.listiterator.components;

public class SteeringWheel extends AbstractWheel {
    private float position;
    private final boolean buttons;

    public SteeringWheel(float diameter, boolean hasButtons) {
        super(diameter);
        this.buttons = hasButtons;
    }

    public void turn(Direction direction) {
        position += direction.getDegree();
        System.out.println("Steering wheel position: " + position);
    }

    public boolean hasButtons() {
        return buttons;
    }

    @Override
    public String toString() {
        return "{" +
                "buttons=" + buttons +
                ", diameter=" + diameter +
                '}';
    }
}
