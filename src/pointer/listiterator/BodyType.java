package pointer.listiterator;

public enum BodyType {
    SEDAN, HATCHBACK, UNIVERSAL, JEEP, MINIVAN, VAN;

    public static BodyType toEnum(String value) {
        return valueOf(value.trim().toUpperCase());
    }

    public static boolean hasValue(String value) {
        BodyType[] bodyTypes = BodyType.values();
        String valueUp = value.trim().toUpperCase();

        for (BodyType bodyType : bodyTypes) {
            if (valueUp.equals(bodyType.name())){
                return true;
            }
        }

        return false;
    }

}
