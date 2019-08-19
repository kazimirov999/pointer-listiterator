import java.util.*;

public class CarManager {

    private List<Car> carList;
    private ArrayList<Integer> carIndexBodyType = new ArrayList<Integer>();


    public CarManager(List<Car> carList) {
        this.carList = carList;
    }


    Car getCar(String brand) {

        if (CarBrands.valueOf(brand).equals(CarBrands.AUDI)) {
            return new Car(new Body("BLACK", CarBrands.AUDI, new Tank(CarBrands.AUDI.getTankMaxVolume(), 30), BodyTypes.SEDAN), new SteeringWheel(35), new Engine(CarBrands.AUDI.getEngiveVolume(), CarBrands.AUDI.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.BMW)) {
            return new Car(new Body("BLUE", CarBrands.BMW, new Tank(CarBrands.BMW.getTankMaxVolume(), 30), BodyTypes.COUPE), new SteeringWheel(35), new Engine(CarBrands.BMW.getEngiveVolume(), CarBrands.BMW.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.DODGE)) {
            return new Car(new Body("WHITE", CarBrands.DODGE, new Tank(CarBrands.DODGE.getTankMaxVolume(), 30), BodyTypes.MINIVAN), new SteeringWheel(40), new Engine(CarBrands.DODGE.getEngiveVolume(), CarBrands.DODGE.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.HONDA)) {
            return new Car(new Body("RED", CarBrands.HONDA, new Tank(CarBrands.HONDA.getTankMaxVolume(), 30), BodyTypes.HATCHBACK), new SteeringWheel(30), new Engine(CarBrands.HONDA.getEngiveVolume(), CarBrands.HONDA.getEnginePower()), new Chassis(2.0f));
        } else if (CarBrands.valueOf(brand).equals(CarBrands.TOYOTA)) {
            return new Car(new Body("RED", CarBrands.TOYOTA, new Tank(CarBrands.TOYOTA.getTankMaxVolume(), 30), BodyTypes.SUV), new SteeringWheel(45), new Engine(CarBrands.TOYOTA.getEngiveVolume(), CarBrands.TOYOTA.getEnginePower()), new Chassis(2.0f));
        } else
            return null;
    }

    Scanner in = new Scanner(System.in);

    void addCar() {
        System.out.println("Choose a brand:");
        CarBrands.showAll();
        String brand = in.nextLine().toUpperCase();
        try {
            carList.add(getCar(brand));
        } catch (IllegalArgumentException e) {
            System.out.println("No such brand");
        }
    }

    void findDiameter(float d) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getChassis().getWheelPressure() == d) {
                System.out.println(carList.get(i).getBody().getBrand());
            }
        }
    }

    void findDiameterAndColor(float d, String color) {
        for (int i = 0; i < carList.size(); i++) {
            if ((carList.get(i).getChassis().getWheelPressure() == d) && carList.get(i).getBody().getColor() == color) {
                System.out.println(carList.get(i).getBody().getBrand());
            }
        }
    }

    void changeRedCarSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBody().getColor() == "RED") {
                carList.get(i).getSteeringWheel().changeSteeringWheel("MK_2");
            }
        }
        System.out.println("Steering Wheels in RED cars were changed for -> MK_2");
    }

    void doubleDiameterInCarWithNonDefaultSteeringWheel() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().getType() != SteeringWheel.DEFAULT_TYPE) {
                System.out.println("Double pressure");
                carList.get(i).pumpAllWheelsTo(carList.get(i).getChassis().getWheelPressure() * 2);
            }
        }
    }

    void replaceCarWithDifferentPressure(float pressure) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getChassis().getWheelPressure() != pressure) {
                System.out.println(carList.get(i).getBody().getBrand() + " has different tire pressure. Replacing...");
                carList.remove(i);
                System.out.println("Choose a brand:");
                CarBrands.showAll();
                String brand = in.nextLine().toUpperCase();
                try {
                    carList.add(i, getCar(brand));
                } catch (IllegalArgumentException e) {
                    System.out.println("No such brand, adding HONDA");
                } finally {
                    carList.add(i, getCar("HONDA"));
                }
            }
        }
    }

    void findBodyTypeCar(BodyTypes type) {
        ListIterator<Car> iterator = carList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBody().getType().equals(type)) {
                System.out.println(carList.get(iterator.previousIndex()).toString());
                carIndexBodyType.add(iterator.previousIndex());
            }
        }
    }

    void replaceWheelTypeToWinterByDiameter(float min, float max) {
        ListIterator<Car> iterator = carList.listIterator();
        while (iterator.hasNext()) {
            float pressureTmp = iterator.next().getChassis().getWheelPressure();
            if (pressureTmp > min && pressureTmp < max) {
                carList.get(iterator.previousIndex()).getChassis().changeAllWheelType(WheelTypes.WINTER);
                System.out.println("Replaced");
            }
        }
    }

    void removeColoredCars(String color) {
        ListIterator<Car> iterator = carList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBody().getColor().equals(color)) {
                iterator.remove();
            }
        }
    }

    void removeCarsWithSteeringWheelDiameterAndBodyType(float min, float max, BodyTypes type) {
        ListIterator<Car> iterator = carList.listIterator();
        while (iterator.hasNext()) {
            Car tmpCar = iterator.next();
            if (tmpCar.getBody().getType().equals(type) && tmpCar.getSteeringWheel().getDiameter() > min && tmpCar.getSteeringWheel().getDiameter() < max) {
                iterator.remove();
            }
        }

    }


    void showInfo() {
        ListIterator<Car> iterator = carList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(carIndexBodyType.toString());
    }
}

