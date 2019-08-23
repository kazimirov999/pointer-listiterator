import java.util.*;

public class CarManager {
    private List<Car> carList = new ArrayList<>();
    private List<Integer> carIndices = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void createCar(String name, Engine engine, Body body, SteeringWheel steeringWheel, Wheel wheels, Tank tank) {
        carList.add(new Car(name, engine, body, steeringWheel, wheels, tank));
    }

    public void createDefaultCar() {
        carList.add(new Car());
    }

    public void printAllCarNames() {
        for (Car car : carList) {
            System.out.println(car.getName());
        }
    }

    public void printRememberedCarIndices() {
        for (Integer index : carIndices) {
            System.out.println(index);
        }
    }

    public void searchByDiameter() {
        System.out.println("Input diameter");
        int inputDiameter = scan.nextInt();
        for (Car car : carList) {
            if (car.getWheels().getDiameter() == inputDiameter) {
                System.out.println(car.getName());
            }
        }
    }

    public void searchByDiameterAndColor() {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        System.out.println("Input color:");
        Colors inputColor = Colors.toEnum(scan.next());
        for (Car car : carList) {
            if (car.getWheels().getDiameter() == inputDiameter && car.getBody().getColor() == inputColor) {
                System.out.println(car.getName());
            }
        }
    }

    public void replaceSteeringWheelsOfRedCars() {
        for (Car car : carList) {
            if (car.getBody().getColor() == Colors.RED) {
                String preferedSteeringWheelType = scan.next();
                if (preferedSteeringWheelType.equals("Multifunctioned")) {
                    car.getSteeringWheel().setType(true);
                } else if (preferedSteeringWheelType.equals("Common")) {
                    car.getSteeringWheel().setType(false);
                } else {
                    System.out.println("You have chosen wrong steering wheel type. Failed changing");
                }
            }
        }
    }

    public void multiplyDiameterByTwoWhenSteeringWheelIsMultifunctioned() {
        for (Car car : carList) {
            if (car.getSteeringWheel().isMuiltifunctioned()) {
                car.getWheels().setDiameter(car.getWheels().getDiameter() * 2);
            }
        }
    }

    public void replaceCarsWhenDiameterIsLessThanEntered() {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        for (Car car : carList) {
            if (car.getWheels().getDiameter() < inputDiameter) {
                carList.set(carList.indexOf(car), new Car());

            }
        }
    }

    public void findCarsWithInputBodyType() {
        Iterator<Car> iterator = carList.iterator();
        System.out.println("Input body type:");
        BodyTypes inputBodyType = BodyTypes.toEnum(scan.next());
        while (iterator.hasNext()) {
            Car currentCar = iterator.next();
            boolean inputBodyTypeIsEqualToInitial = currentCar.getBody().getType() == inputBodyType;
            if (inputBodyTypeIsEqualToInitial) {
                System.out.println(currentCar.getName());
            }
        }
    }

    public void deleteCarsWithInputBodyType() {
        Iterator<Car> iterator = carList.iterator();
        System.out.println("Input body type of car you want to delete:");
        BodyTypes inputBodyType = BodyTypes.toEnum(scan.next());
        while (iterator.hasNext()) {
            boolean inputBodyTypeIsEqualToInitial = iterator.next().getBody().getType() == inputBodyType;
            if (inputBodyTypeIsEqualToInitial) {
                iterator.remove();
            }
        }
    }

    public void setWinterTiresToCarsWithGivenDiameterRange() {
        Iterator<Car> iterator = carList.iterator();
        System.out.println("Input start of range you want:");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of range you want:");
        int rangeEnd = scan.nextInt();
        while (iterator.hasNext()) {
            Car currentCar = iterator.next();
            boolean diameterIsInRange = currentCar.getWheels().getDiameter() > rangeStart && currentCar.getWheels().getDiameter() < rangeEnd;
            if (diameterIsInRange) {
                currentCar.getWheels().setType(true);
                System.out.println("Wheel type has been set to winter for " + currentCar.getName());
            }
        }
    }

    public void deleteCarsWithInputBodyTypeAndDiameterRange() {
        Iterator<Car> iterator = carList.iterator();
        System.out.println("Input body type: ");
        BodyTypes inputBodyType = BodyTypes.toEnum(scan.next());
        System.out.println("Input start of diameter range:");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of diameter range:");
        int rangeEnd = scan.nextInt();
        while (iterator.hasNext()) {
            Car currentCar = iterator.next();
            boolean diameterIsInRange = currentCar.getWheels().getDiameter() > rangeStart && currentCar.getWheels().getDiameter() < rangeEnd;
            boolean inputBodyTypeIsEqualToInitial = currentCar.getBody().getType() == inputBodyType;
            if (diameterIsInRange && inputBodyTypeIsEqualToInitial) {
                iterator.remove();
            }
        }
    }

    public void rememberIndicesOfCarsWithInputBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input body type of car you want to find:");
        BodyTypes inputBodyType = BodyTypes.toEnum(scan.next());
        while (listIterator.hasNext()) {
            Car currentCar = listIterator.next();
            boolean inputBodyTypeIsEqualToInitial = currentCar.getBody().getType() == inputBodyType;
            if (inputBodyTypeIsEqualToInitial) {
                carIndices.add(listIterator.previousIndex());
            }
        }
    }
}
