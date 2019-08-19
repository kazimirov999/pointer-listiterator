import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        CarManager carManager = new CarManager(cars);

        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("DODGE"));
        cars.add(carManager.getCar("BMW"));
        cars.add(carManager.getCar("HONDA"));
        cars.add(carManager.getCar("AUDI"));
        cars.get(4).getBody().repaint("RED");
        cars.add(carManager.getCar("TOYOTA"));
        cars.add(carManager.getCar("AUDI"));
        cars.add(carManager.getCar("DODGE"));
        cars.add(carManager.getCar("HONDA"));
        cars.add(carManager.getCar("AUDI"));


        carManager.findBodyTypeCar(BodyTypes.SEDAN);
        carManager.replaceWheelTypeToWinterByDiameter(0, 4f);
        carManager.removeCarsWithSteeringWheelDiameterAndBodyType(10f, 45f, BodyTypes.MINIVAN);
        carManager.removeColoredCars("RED");

        carManager.showInfo();

    }
}
