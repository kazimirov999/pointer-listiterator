package pointer.listiterator.actions;

import pointer.listiterator.BodyType;
import pointer.listiterator.Car;
import pointer.listiterator.Color;
import pointer.listiterator.components.SteeringWheel;
import pointer.listiterator.components.Wheel;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Changer extends CarBuilder {
    public void makeDoubleWheelsDiameter(Iterator<Car> carIterator, boolean steeringWheelHasButtons) {
        carIterator.forEachRemaining(c -> {
            if (c.getSteeringWheel().hasButtons() == steeringWheelHasButtons) {
                c.changeWheelsDiameter(2);
                System.out.println("Double diameter is made for " + c);
            }
        });
    }

    public void changeSteeringWheel(Iterator<Car> carIterator, Color color, float diameter, boolean hasButtons) {
        carIterator.forEachRemaining(c -> {
            if (c.getColor() == color) {
                c.setSteeringWheel(new SteeringWheel(diameter, hasButtons));
                System.out.println("Steering Wheel is changed for car: " + c);
            }
        });
    }

    public void changeCarsWithSmallDiameter(ListIterator<Car> carIterator, float diameter, String[] params) {
        while (carIterator.hasNext()) {
            Car car = carIterator.next();

            if (car.getWheelsDiameter() >= diameter) {
                continue;
            }

            System.out.println(car + " has diameter smaller than " + diameter + ". Set new one:");
            Car newCar = null;

            while (newCar == null) {
                newCar = buildNewCar(params[1], params[2], params[3], params[4]);
            }

            carIterator.set(newCar);
        }
    }

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

    public void changeWheels(Iterator<Car> carIterator, float minDiameter, float maxDiameter, boolean isWinterWheels){
        System.out.println("Changing wheels to" + (isWinterWheels ? "winter" : "summer") + "wheels.");

        carIterator.forEachRemaining(c -> {
            if (c.getWheelsDiameter() >= minDiameter && c.getWheelsDiameter() <= maxDiameter) {
                c.changeWheels(isWinterWheels);
                System.out.println("Wheels are changed for " + c);
            }
        });
    }
}
