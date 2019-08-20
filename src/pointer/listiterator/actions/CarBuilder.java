package pointer.listiterator.actions;

import pointer.listiterator.BodyType;
import pointer.listiterator.Car;
import pointer.listiterator.Color;
import pointer.listiterator.components.Wheel;

import java.util.Arrays;

public class CarBuilder {
    public Car buildNewCar(String brand, String color, String type, String diameter) {
        if (!Color.hasValue(color)) {
            System.out.println("Color '" + color + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
            return null;
        }

        if (!BodyType.hasValue(type)) {
            System.out.println("Body type '" + type + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(BodyType.values()));
            return null;
        }

        float d;

        try {
            d = Float.parseFloat(diameter);
        } catch (NumberFormatException nex) {
            System.out.println("Wheel diameter should be float");
            return null;
        }

        return new Car(brand, Color.toEnum(color), BodyType.toEnum(type),
                new Wheel(d), new Wheel(d), new Wheel(d), new Wheel(d));
    }
}
