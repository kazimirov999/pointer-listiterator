import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        CarManager carManager = new CarManager(cars);

        Car volvo = new Car("Volvo","Hatchback", 18, 20, 15,"Green");
        Car landRover = new Car("LandRover", "Sedan", 19, 30,16,"White");
        Car ford = new Car("Ford", "Coupe", 17, 25, 17,"Black");
        Car tesla = new Car("Tesla", "Sedan", 15, 40, 18,"Grey");
        Car mazda = new Car("Mazda", "SUV", 16, 30, 19,"Purple");

        cars.add(volvo);
        cars.add(landRover);
        cars.add(ford);
        cars.add(tesla);
        cars.add(mazda);

        carManager.findBodyType();
        carManager.deleteColor();
        carManager.changeOnWinter();
        carManager.removeCar();
        carManager.rememberIndex();

    }
}
