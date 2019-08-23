public enum BodyTypes {
    HATCHBACK("Hatchback"),
    SEDAN("Sedan"),
    COUPE("Coupe"),
    CONVERTIBLE("Convertible"),
    WAGON("Wagon"),
    VAN("Van"),
    JEEP("Jeep"),
    PICKUP("Pickup"),
    MUV("Muv"),
    SUV("Suv");

    private String bodyType;

    BodyTypes(String bodyType) {
        this.bodyType = bodyType;
    }

    public static BodyTypes toEnum(String inputBodyType) {
        return BodyTypes.valueOf(inputBodyType.toUpperCase());
    }
}