package pointer.listiterator.actions;

import pointer.listiterator.BodyType;
import pointer.listiterator.Car;
import pointer.listiterator.Color;

import java.util.Iterator;

public class Deleter {
    public void remove(Iterator<Car> iterator, Color color) {
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getColor() == color) {
                System.out.println("Car " + car + " is removed.");
                iterator.remove();
            }
        }
    }

    public void remove(Iterator<Car> iterator, BodyType type, float minDiameter, float maxDiameter) {
        while (iterator.hasNext()) {
            Car car = iterator.next();

            if (car.getBodyType() == type && car.getSteeringWheel().getDiameter() >= minDiameter &&
                    car.getSteeringWheel().getDiameter() <= maxDiameter) {
                System.out.println(car + " is removed.");
                iterator.remove();
            }
        }
    }
}
