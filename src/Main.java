
public class Main {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        carManager.crateNewCar("Volkswagen", "T4", BodyType.MINIVAN, CarColor.BLACK,
                WheelsType.WINTER, 16);
        carManager.crateNewCar("Toyota", "Camry", BodyType.SEDAN, CarColor.BLACK,
                WheelsType.SUMMER, 16);
        carManager.crateNewCar("AUDI", "A6", BodyType.SEDAN, CarColor.RED,
                WheelsType.SUMMER, 19);
        carManager.crateNewCar("MAZDA", "RX7", BodyType.COUPE, CarColor.BLUE,
                WheelsType.SUMMER, 19);
        carManager.crateNewCar("BMW", "X5M", BodyType.SUV, CarColor.WHITE,
                WheelsType.WINTER, 16);


        carManager.searchCarInputBody();
        carManager.remoteCarInputColor();
        carManager.changeTypeWheelsInputDiameter();
        carManager.remoteCarInputBodyTypeAndWheelsDiameter();
        carManager.rememberIndexCarInputBodyType();

    }
}
