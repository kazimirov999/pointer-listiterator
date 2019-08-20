package pointer.listiterator.actions;

import pointer.listiterator.BodyType;
import pointer.listiterator.Car;
import pointer.listiterator.Color;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Search {
    private List<Integer> indexes = new ArrayList<>();

    public List<Integer> getIndexes() {
        return indexes;
    }

    public void find(Iterator<Car> carIterator, Color color) {
        System.out.print("[");
        carIterator.forEachRemaining(c -> {
            if (c.getColor() == color) {
                System.out.println(c + ", ");
            }
        });
        System.out.println("]");
    }

    public void find(ListIterator<Car> carIterator, BodyType bodyType) {
        System.out.print("[");

        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getBodyType() == bodyType) {
                System.out.println(car + ", ");
                indexes.add(carIterator.previousIndex() + 1);
            }
        }

        System.out.println("]");
    }

    public void find(Iterator<Car> carIterator, float diameter) {
        System.out.print("[");
        carIterator.forEachRemaining(c -> {
            if (c.getWheelsDiameter() == diameter) {
                System.out.println(c + ", ");
            }
        });
        System.out.println("]");
    }

    public void find(Iterator<Car> carIterator, float diameter, Color color) {
        System.out.print("[");
        carIterator.forEachRemaining(c -> {
            if (c.getWheelsDiameter() == diameter && c.getColor() == color) {
                System.out.println(c + ", ");
            }
        });
        System.out.println("]");
    }

    public String display(Iterator<Car> it) {
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            Car e = it.next();
            sb.append(e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(",\n").append(' ');
        }
    }
}
