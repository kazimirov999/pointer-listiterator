public enum Colors {
    RED("Red"),
    BLACK("Black"),
    GREEN("Green"),
    BLUE("Blue"),
    WHITE("White"),
    VIOLET("Violet"),
    YELLOW("Yellow");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public static Colors toEnum(String inputColor) {
        return Colors.valueOf(inputColor.toUpperCase());
    }
}