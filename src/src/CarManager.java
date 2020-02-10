import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CarManager {

    private List<Car> cars;

    Scanner scanner = new Scanner(System.in);

    public CarManager(List<Car> cars) {
        this.cars = cars;
    }

    void findBodyType(){
        ListIterator<Car> listIterator = cars.listIterator();
        System.out.println("Введіть тип кузову: ");
        String b = scanner.nextLine();
        while (listIterator.hasNext()){
            Car car =  listIterator.next();
            if (car.body.getBodyType().equals(b)){
                System.out.println(car.getModel());
            }
        }
    }

    void deleteColor(){
        ListIterator<Car> listIterator = cars.listIterator();
        System.out.println("Введіть колір авто, який бажате видалити: ");
        String c = scanner.nextLine();
        while (listIterator.hasNext()){
            Car car = listIterator.next();
            if (car.body.getColor().equals(c)){
                listIterator.remove();
                System.out.println("Ви видалили: " + car.getModel());
            }
        }
    }

    void changeOnWinter(){
        ListIterator<Car> listIterator = cars.listIterator();
        System.out.println("Введіть нижнє значення діаметру коліс:");
        int d = scanner.nextInt();
        System.out.println("Введіть вернє значення діаметру коліс: ");
        int u = scanner.nextByte();
        while (listIterator.hasNext()){
            Car car = listIterator.next();
            if (car.wheels.getDiameter() >= d && car.wheels.getDiameter() <= u){
                car.wheels.setWinter("зимова гума");
                System.out.println("Зимову гуму встановлено на: " + car.getModel());
            }
        }
    }

    void removeCar(){
        ListIterator<Car> listIterator = cars.listIterator();
        System.out.println("Введіть тип кузова, що бажаєте видалити: ");
        String b = scanner.next();
        System.out.println("Введіть нижнє значаннє діаметру керма: ");
        int d = scanner.nextInt();
        System.out.println("Введіть верхнє значення діаметру керма: ");
        int u = scanner.nextInt();
        while (listIterator.hasNext()){
            Car car = listIterator.next();
            if ((car.body.getBodyType().equals(b) && (car.steeringWheel.getRadius() >= d && car.steeringWheel.getRadius() <= u))){
                listIterator.remove();
                System.out.println("Ви видалили: " + car.getModel() + car.toString());
            }
        }
    }

    void rememberIndex(){
        ListIterator<Car> listIterator = cars.listIterator();
        List<String> index = new ArrayList<>();
        System.out.println("Введіть тип кузову: ");
        String b = scanner.next();
        while (listIterator.hasNext()){
            Car car = listIterator.next();
            if (car.body.getBodyType().equals(b)){
                index.add(0, "car");
                System.out.println(index.size());
            }
        }
    }

}
