public enum BodyType {
    SUV("SUV"),
    HATCHBACK("HATCHBACK"),
    SEDAN("SEDAN"),
    COUPE("COUPE"),
    MINIVAN("MINIVAN");
    private String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return bodyType;
    }
}
