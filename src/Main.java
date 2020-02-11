import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        CarSearch carSearch = new CarSearch(carList);

        carList.add(new Car("Ferrari", "Testarossa", Color.WHITE, BodyType.COUPE, 20, 10, false));
        carList.add(new Car("Mazda", "RX-8", Color.RED, BodyType.CABRIO, 14, 15, true));
        carList.add(new Car("Ford", "GT-40", Color.ORANGE, BodyType.COUPE, 18, 14, false));
        carList.add(new Car("Audi", "Quatro", Color.RED, BodyType.LEAFTBACK, 20, 12, true));
        carList.add(new Car("Toyota", "Celica", Color.ORANGE, BodyType.COUPE, 16, 11, false));
        carList.add(new Car("Opel", "Manta", Color.GREEN, BodyType.COUPE, 17, 14, false));
        carList.add(new Car("Nissan", "Patrol", Color.BLACK, BodyType.SUV, 19, 15, true));
        carList.add(new Car("Toyota", "Hillux", Color.WHITE, BodyType.SUV, 22, 16, true));


        carSearch.findCarsWithBodyType();
        carSearch.deleteAllCarsWithBodyType();
        carSearch.exchangeOnWinterTyres();
        carSearch.deleteCarWithBodyTypeAndRadiusOfSteeringWheel();
        carSearch.rememberIndexofCarwithBodyType();

    }
}