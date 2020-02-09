import java.util.*;

public class CarManager {
    private List<Car> carList = new ArrayList<>();
    private List<Integer> carIndex = new ArrayList<>();
    private Scanner carScanner = new Scanner(System.in);

    public void crateNewCar(String model, String mark, BodyType bodyType, CarColor carColor, WheelsType wheelsType,
                            int wheelsDiameter) {
        carList.add(new Car(model, mark, bodyType, carColor, wheelsType, wheelsDiameter));
    }

    public void searchCarInputBody() {
        Iterator<Car> carIterator = carList.iterator();
        System.out.println("Input body:");
        String inputBody = carScanner.nextLine();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getBody().getBodyType().toString().equals(inputBody)) {
                System.out.println(car.getModel());
            }
        }
    }

    public void remoteCarInputColor() {
        Iterator<Car> carIterator = carList.iterator();
        System.out.println("Input color:");
        String inputColor = carScanner.nextLine();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getBody().getCarColor().toString().equals(inputColor)) {
                System.out.println(car.getModel() + " /remove");
                carIterator.remove();
            }
        }
    }

    public void changeTypeWheelsInputDiameter() {
        Iterator<Car> carIterator = carList.iterator();
        System.out.println("Input diameter:");
        int inputDiameter = carScanner.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getWheels().getWheelsDiameter() == inputDiameter) {
                System.out.println(car.getModel() + " " + car.getWheels().getWheelsType());
                car.getWheels().setWheelsType(WheelsType.WINTER);
                System.out.println(car.getModel() + " " + car.getWheels().getWheelsType());
            }
        }
    }
    public void remoteCarInputBodyTypeAndWheelsDiameter(){
        Iterator<Car> carIterator = carList.iterator();
        System.out.println("Input body type:");
        String inputBodyType = carScanner.nextLine();
        System.out.println("Input wheels diameter:");
        int inputWheelsDiameter = carScanner.nextInt();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if (car.getBody().getBodyType().toString().equals(inputBodyType) &&
                    car.getWheels().getWheelsDiameter() == inputWheelsDiameter){
                System.out.println(car.getModel() + " /remove");
                carIterator.remove();
            }
        }

    }
    public void rememberIndexCarInputBodyType(){
        ListIterator<Car> carListIterator = carList.listIterator();
        System.out.println("Input body type:");
        String inputBodyType = carScanner.nextLine();
        while (carListIterator.hasNext()){
            Car car = carListIterator.next();
            if (car.getBody().getBodyType().toString().equals(inputBodyType)){
                System.out.println(car.getModel());
                carIndex.add(carListIterator.previousIndex());
            }
        }
    }
}
