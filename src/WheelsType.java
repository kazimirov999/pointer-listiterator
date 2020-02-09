public enum WheelsType {
    WINTER("WINTER"),
    SUMMER("SUMMER");
    private String wheelsType;

    WheelsType(String wheelsType) {
        this.wheelsType = wheelsType;
    }

    @Override
    public String toString() {
        return wheelsType;
    }
}
