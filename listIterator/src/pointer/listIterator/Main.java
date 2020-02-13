package pointer.listIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Body body = new Body();
        List<Car> cars = new ArrayList<>();
        CarIterator cars1 = new CarIterator(cars);

        cars.add(new Car("Volvo", "1988", 16, 20, "red", "sedan", true));
        cars.add(new Car("Opel", "1998", 16, 15, "blue", "universal", false));
        cars.add(new Car("Audi", "2000", 19, 18, "green", "heshbek", true));
        cars.add(new Car("Subaru", "2000", 24, 20, "red", "sedan", true));
        cars.add(new Car("Reno", "2000", "red"));
        cars.add(new Car("Lada", "1988", 13, 20, "green", "sedan", false));
        cars.add(new Car("Tavriya", "1991", "sedan"));





        cars1.enteredBodyType();
        cars1.removeCarsWithBodyColor();
       cars1.replaceTiresSpecifiedRange();
        cars1.bodTypeAndWheelDiameterRemoved();
        cars1.memorizeMachineIndexes("red");


    }
}
