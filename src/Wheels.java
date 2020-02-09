public class Wheels {
    private WheelsType wheelsType;
    private int wheelsDiameter;

    public Wheels(WheelsType wheelsType, int wheelsDiameter) {
        this.wheelsType = wheelsType;
        this.wheelsDiameter = wheelsDiameter;
    }

    public WheelsType getWheelsType() {
        return wheelsType;
    }

    public void setWheelsType(WheelsType wheelsType) {
        this.wheelsType = wheelsType;
    }

    public int getWheelsDiameter() {
        return wheelsDiameter;
    }

    public void setWheelsDiameter(int wheelsDiameter) {
        this.wheelsDiameter = wheelsDiameter;
    }
}
