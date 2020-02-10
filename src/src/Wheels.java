public class Wheels {

    private int diameter;
    private  String winter;

    public void setWinter(String winter) {
        this.winter = winter;
    }

    String[] wheels = {"wheel1", "wheel2", "wheel3", "wheel4"};

    public Wheels(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
