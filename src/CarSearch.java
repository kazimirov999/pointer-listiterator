import java.util.*;

public class CarSearch {

    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);

    private List<Car> carList;

    public CarSearch(List<Car> carList) {
        this.carList = carList;
    }

    public void findCarsWithBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Write body type to find a suitable car- ");
        String inputBodyType = scanStr.nextLine();
        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            if (car.body.getBodyType().toString().equals(inputBodyType.toUpperCase())) {
                System.out.println(car.getModel());
            }
        }
    }

    public void deleteAllCarsWithBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Write body type to delete a suitable car- ");
        String inputColor = scanStr.nextLine();
        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            if (car.body.getColor().toString().equals(inputColor.toUpperCase())) {
                listIterator.remove();
                System.out.println("You are deleted  " + car.getModel());
            }
        }
    }

    public void exchangeOnWinterTyres() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Write lower R`  to exchanging tyres on Winter`s - ");
        int inputRadiusLow = scanInt.nextInt();
        System.out.println("Write upper R` to exchanging tyres on Winter`s - ");
        int inputRadiusUp = scanInt.nextInt();
        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            if (car.wheel.getWheelRadius() >= inputRadiusLow && car.wheel.getWheelRadius() <= inputRadiusUp) {
                car.wheel.setWinterTyre("Winter Tyres are downloading...");
                System.out.println(" Winter Tyres are on - " + car.getModel());
            }
        }
    }

    public void deleteCarWithBodyTypeAndRadiusOfSteeringWheel() {
        ListIterator<Car> listIterator = carList.listIterator();
        System.out.println("Write body type of a suitable car - ");
        String inputBodyType = scanStr.nextLine();
        System.out.println("Write lower R`of steering wheel of a suitable car -  ");
        int inputRadiusLow = scanInt.nextInt();
        System.out.println("Write upper R`of steering wheel of a suitable car -  ");
        int inputRadiusUp = scanInt.nextInt();
        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            if (car.body.getBodyType().toString().equals(inputBodyType.toUpperCase()) && car.wheel.getWheelRadius() >= inputRadiusLow && car.wheel.getWheelRadius() <= inputRadiusUp) {
                listIterator.remove();
                System.out.println(" You are deleted:  " + car.getModel() + car.toString());

            }
        }
    }

    public void rememberIndexOfCarWithBodyType() {
        ListIterator<Car> listIterator = carList.listIterator();
        List<List<Car>> index = new ArrayList<>();
        System.out.println("Write body type of a suitable car - ");
        String inputBodyType = scanStr.nextLine();
        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            if (car.body.getBodyType().toString().equals(inputBodyType.toUpperCase())) {
                index.add(carList);
                System.out.println(car.getModel());
            }

        }
    }
}