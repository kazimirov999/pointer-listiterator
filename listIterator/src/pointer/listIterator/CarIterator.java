package pointer.listIterator;

import java.util.*;

public class CarIterator {

    Scanner scanner = new Scanner(System.in);
    private List<Car> car;
    ListIterator<Car> listCar;
    ArrayList<Integer> indexCar = new ArrayList<>();
    List<Car> carL = new ArrayList<Car>();


    public CarIterator(List<Car> car) {
        this.car = car;
    }


    public void enteredBodyType() {
        int index = 0;
        listCar = car.listIterator();
        System.out.println("Введите тип кузов");
        String txt = scanner.nextLine();
        while (listCar.hasNext()) {
            Car car = listCar.next();
            if (car.getBody().equals(txt)) {
                index++;
                System.out.println("Знайдено " + index + " " + car.getBody());
            }
        }
    }

    public void removeCarsWithBodyColor() {
        listCar = car.listIterator();
        System.out.println("видалено машини які мають колір кузова");
        while (listCar.hasNext()) {
            Car car = listCar.next();
            if (car.getColor() == car.getColor()) {
                listCar.remove();
                System.out.println("delete color to - " + car.getColor());
            }
            if (car.getColor() == null) {
                System.out.println(car.getNames());
            }
        }
    }

    public void replaceTiresSpecifiedRange() {
        String teplaseTirres = "Зимова";
        listCar = car.listIterator();
        System.out.println("Введіть радіус колеса");
        String rd = scanner.nextLine();
        int rd1 = Integer.parseInt(rd);
        while (listCar.hasNext()) {
            Car car = listCar.next();
            if (rd1 >= car.getRadius() && rd1 <= car.getRadius()) {
                String r = car.setRadius(teplaseTirres);
                System.out.println("резину було замінено на " + r);
                break;
            } else {
                System.out.println("В парку автомобілів з таким радіусом коліс " + rd1 + " немає");
                break;
            }
        }
    }

    public void bodTypeAndWheelDiameterRemoved() {
        Car car2;
        System.out.println("Введите тип кузова");
        String vvod1 = scanner.nextLine();
        System.out.println("введіть діаметр керма");
        String vvod2 = scanner.nextLine();
        int v2 = Integer.parseInt(vvod2);
        listCar = car.listIterator();
        while (listCar.hasNext()) {
            car2 = listCar.next();
            if (vvod1.equals(car2.getBody()) & v2 >= car2.getDiameterHelm() & v2 <= car2.getDiameterHelm()) {
                listCar.remove();
                System.out.println(car2.getNames() + " " + car2.getYears() + " видалено");
            }
        }
    }


    public void memorizeMachineIndexes(String color) {
        try {
            int i;
            listCar = car.listIterator();
            while (listCar.hasNext()) {
                Car car = listCar.next();
                i = listCar.nextIndex();
                if (car.getColor().equals(color)) {
                    indexCar.add(i);
                    System.out.println(i + " " + car.getNames());
                }
            }
        } catch (Exception e) {
            System.out.println("Помилка");
        }
        return;
    }
}



