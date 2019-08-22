public class Main {

    public static void main(String[] args) {
        Engine mazdaEngine = new Engine(50, 100);
        Engine chevroletEngine = new Engine(20, 250);
        Engine fordEngine = new Engine(80, 150);
        Engine audiEngine = new Engine(40, 120);
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
        CarManager carManager = new CarManager();
        carManager.carList.add(new Car("Mazda", mazdaEngine, blackBody, multifunctionedSteeringWheel, mazdaWheels));
        carManager.carList.add(new Car("Chevrolet", chevroletEngine, yellowBody, multifunctionedSteeringWheel, chevroletWheels));
        carManager.carList.add(new Car("Ford", fordEngine, whiteBody, commonSteeringWheel, fordWheels));
        carManager.carList.add(new Car("Audi", audiEngine, violetBody, commonSteeringWheel, audiWheels));
        carManager.carList.add(new Car());
        carManager.searchByDiameter();
        carManager.searchByDiameterAndColor();
        carManager.replaceSteeringWheelsOfRedCars();
        carManager.multiplyDiameterByTwoWhenSteeringWheelIsMultifunctioned();
        carManager.replaceCarsWhenDiameterIsLessThanEntered();
        carManager.findCarsWithInputBodyType();
        carManager.deleteCarsWithInputBodyType();
        carManager.setWinterTiresToCarsWithGivenDiameterRange();
        carManager.deleteCarsWithInputBodyTypeAndDiameterRange();
        carManager.findIndicesOfCarsWithInputBodyType();
    }
}