import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Engine mazdaEngine = new Engine(50);
        Engine chevroletEngine = new Engine(20);
        Engine fordEngine = new Engine(80);
        Engine audiEngine = new Engine(40);
        Body blackBody = new Body("Black", "Sedan");
        Body yellowBody = new Body("Yellow", "Coupe");
        Body whiteBody = new Body("White", "Suv");
        Body violetBody = new Body("Violet", "Convertible");
        SteeringWheel commonSteeringWheel = new SteeringWheel(true);
        SteeringWheel multifunctionedSteeringWheel = new SteeringWheel( true);
        Wheel mazdaWheels = new Wheel(16);
        Wheel chevroletWheels = new Wheel(13, true);
        Wheel fordWheels = new Wheel(14, false);
        Wheel audiWheels = new Wheel(16, true);
        Tank mazdaTank = new Tank(100);
        Tank chevroletTank = new Tank(259);
        Tank fordTank = new Tank(150);
        Tank audiTank = new Tank(120);
        CarManager carManager = new CarManager();
        carManager.createCar("Mazda", mazdaEngine, blackBody, multifunctionedSteeringWheel, mazdaWheels, mazdaTank);
        carManager.createCar("Chevrolet", chevroletEngine, yellowBody, multifunctionedSteeringWheel, chevroletWheels, chevroletTank);
        carManager.createCar("Ford", fordEngine, whiteBody, commonSteeringWheel, fordWheels, fordTank);
        carManager.createCar("Audi", audiEngine, violetBody, commonSteeringWheel, audiWheels, audiTank);
        carManager.createDefaultCar();
        carManager.printAllCarNames();
        carManager.searchByDiameter();
        System.out.println("-----------------------");
        carManager.searchByDiameterAndColor();
        System.out.println("-----------------------");
        carManager.replaceSteeringWheelsOfRedCars();
        System.out.println("-----------------------");
        carManager.multiplyDiameterByTwoWhenSteeringWheelIsMultifunctioned();
        System.out.println("-----------------------");
        carManager.replaceCarsWhenDiameterIsLessThanEntered();
        System.out.println("-----------------------");
        carManager.printAllCarNames();
        System.out.println("-----------------------");
        carManager.findCarsWithInputBodyType();
        System.out.println("-----------------------");
        carManager.deleteCarsWithInputBodyType();
        System.out.println("-----------------------");
        carManager.printAllCarNames();
        System.out.println("-----------------------");
        carManager.setWinterTiresToCarsWithGivenDiameterRange();
        System.out.println("-----------------------");
        carManager.deleteCarsWithInputBodyTypeAndDiameterRange();
        System.out.println("-----------------------");
        carManager.printAllCarNames();
        System.out.println("-----------------------");
        carManager.rememberIndicesOfCarsWithInputBodyType();
        System.out.println("-----------------------");
        carManager.printRememberedCarIndices();
    }
}