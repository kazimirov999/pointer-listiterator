import java.util.*;

public class CarManager {
    List<Car> carList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void searchByDiameter() {
        System.out.println("Input diameter");
        int inputDiameter = scan.nextInt();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getWheels().getDiameter() == inputDiameter) {
                System.out.println(carList.get(i).getName());
            }
        }
    }

    public void searchByDiameterAndColor() {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        System.out.println("Input color:");
        Colors inputColor = Colors.valueOf(scan.next().toUpperCase());
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getWheels().getDiameter() == inputDiameter && carList.get(i).getBody().getColor() == inputColor) {
                System.out.println(carList.get(i).getName());
            }
        }
    }

    public void replaceSteeringWheelsOfRedCars() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBody().getColor() == Colors.RED) {
                String preferedSteeringWheelType = scan.next();
                if (preferedSteeringWheelType == "Multifunctioned") {
                    carList.get(i).getSteeringWheel().setType(true);
                } else if (preferedSteeringWheelType == "Common") {
                    carList.get(i).getSteeringWheel().setType(false);
                    ;
                } else {
                    System.out.println("You have chosen wrong steering wheel type. Failed changing");
                }
            }
        }
    }

    public void multiplyDiameterByTwoWhenSteeringWheelIsMultifunctioned() {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getSteeringWheel().isMuiltifunctioned()) {
                carList.get(i).getWheels().setDiameter(carList.get(i).getWheels().getDiameter() * 2);
            }
        }
    }

    public void replaceCarsWhenDiameterIsLessThanEntered() {
        System.out.println("Input diameter:");
        int inputDiameter = scan.nextInt();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getWheels().getDiameter() < inputDiameter) {
                carList.add(i, new Car());
            }
        }
    }

    public void findCarsWithInputBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input body type:");
        BodyTypes inputGBodyType = BodyTypes.valueOf(scan.next().toUpperCase());
        while (listIterator.hasNext()) {
            listIterator.next();
            boolean inputBodyTypeIsEqualToInitial = carList.get(listIterator.previousIndex()).getBody().getType().equals(inputGBodyType);
            if (inputBodyTypeIsEqualToInitial) {
                System.out.println(carList.get(listIterator.previousIndex()).getName());
            }
        }
    }

    public void deleteCarsWithInputBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input body type of car you want to delete:");
        BodyTypes inputGBodyType = BodyTypes.valueOf(scan.next().toUpperCase());
        while (listIterator.hasNext()) {
            listIterator.next();
            boolean inputBodyTypeIsEqualToInitial = carList.get(listIterator.previousIndex()).getBody().getType().equals(inputGBodyType);
            if (inputBodyTypeIsEqualToInitial) {
                listIterator.remove();
            }
        }
    }

    public void setWinterTiresToCarsWithGivenDiameterRange() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input start of range you want:");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of range you want:");
        int rangeEnd = scan.nextInt();
        while (listIterator.hasNext()) {
            listIterator.next();
            boolean diameterIsInRange = carList.get(listIterator.previousIndex()).getWheels().getDiameter() > rangeStart && carList.get(listIterator.previousIndex()).getWheels().getDiameter() < rangeEnd;
            if (diameterIsInRange) {
                carList.get(listIterator.previousIndex()).getWheels().setType(true);
                System.out.println("Wheel type has been set to winter for " + carList.get(listIterator.previousIndex()).getName());
            }
        }
    }

    public void deleteCarsWithInputBodyTypeAndDiameterRange() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input body type: ");
        BodyTypes inputBodyType = BodyTypes.valueOf(scan.next().toUpperCase());
        System.out.println("Input start of diameter range:");
        int rangeStart = scan.nextInt();
        System.out.println("Input end of diameter range:");
        int rangeEnd = scan.nextInt();
        while (listIterator.hasNext()) {
            listIterator.next();
            boolean diameterIsInRange = carList.get(listIterator.previousIndex()).getWheels().getDiameter() > rangeStart && carList.get(listIterator.previousIndex()).getWheels().getDiameter() < rangeEnd;
            boolean inputBodyTypeIsEqualToInitial = carList.get(listIterator.previousIndex()).getBody().getType().equals(inputBodyType);
            if (diameterIsInRange && inputBodyTypeIsEqualToInitial) {
                listIterator.remove();
            }
        }
    }

    public void findIndicesOfCarsWithInputBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Input body type of car you want to find:");
        BodyTypes inputBodyType = BodyTypes.valueOf(scan.next().toUpperCase());
        while (listIterator.hasNext()) {
            listIterator.next();
            boolean inputBodyTypeIsEqualToInitial = carList.get(listIterator.previousIndex()).getBody().getType().equals(inputBodyType);
            if (inputBodyTypeIsEqualToInitial) {
                System.out.println("Car index with input body type is: " + listIterator.previousIndex());
            }
        }
    }
}
