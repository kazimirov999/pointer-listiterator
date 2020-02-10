import java.util.ArrayList;
import java.util.ListIterator;

public class CarDataBase {

    ArrayList<Car> carList = new ArrayList<Car>();

    public void setCarList(){
        carList.add(new Car("Skoda","red", "ліфтбек", 14));
        carList.add(new Car("Volkswagen","green", "седан", 15));
        carList.add(new Car("Mazda","black", "універсал", 16 ));
        carList.add(new Car("Honda","blue", "хечбек", 17));
        carList.add(new Car("Audi","white", "купе", 18));
    }

    public ArrayList<Car> findByBodyType(String bodyType) {
        ListIterator<Car> carListIterator = carList.listIterator();
        ArrayList<Car> listCarByBodyType = new ArrayList<Car>();
        while (carListIterator.hasNext()){
            Car car = carListIterator.next();
            if (car.body.getBodyType().equals(bodyType)){
                listCarByBodyType.add(car);
            }
        }
        return listCarByBodyType;
    }

    public ArrayList<Car> removeCarByBodyColor(String bodyColor){
        ListIterator<Car> carListIterator = carList.listIterator();
        while (carListIterator.hasNext()){
            if (carListIterator.next().body.getColor().equals(bodyColor)){
                carListIterator.remove();
            }
        }
        return carList;
    }

    public ArrayList<Car> сhangeWheelByDiameter(int minDiameter, int maxDiameter){
        ListIterator<Car> carListIterator = carList.listIterator();
        while (carListIterator.hasNext()){
            Car car = carListIterator.next();
            int diameter = car.wheels.getDiameter();
            if (diameter >= minDiameter && diameter <= maxDiameter){
                car.сhangeWheels(diameter);
            }
        }
        return carList;
    }

    public ArrayList<Car> removeCarByBodyTypeAndWheelsDiameter(String bodyType, int minDiameter, int maxDiameter){
        ListIterator<Car> carListIterator = carList.listIterator();
        while (carListIterator.hasNext()){
            Car car = carListIterator.next();
            int diameter = car.wheels.getDiameter();
            String hasBodyType = car.body.getBodyType();
            if (diameter >= minDiameter && diameter <= maxDiameter && hasBodyType.equals(bodyType)){
                carListIterator.remove();
            }
        }
        return carList;
    }

    public ArrayList<Integer> indexCarByBodyType(String bodyType){
        ArrayList<Integer> indexCar = new ArrayList<>();
        ListIterator<Car> carListIterator = carList.listIterator();
        while (carListIterator.hasNext()){
            int index = carListIterator.nextIndex();
            if (carListIterator.next().body.getBodyType().equals(bodyType)){
                indexCar.add(index);
            }
        }
        return indexCar;
    }
}
