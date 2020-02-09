public enum CarColor {
    BLACK("BLACK"),
    WHITE("WHITE"),
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    BLUE("BLUE"),
    RED("RED");
    private String carColor;

    CarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return carColor;
    }
}
