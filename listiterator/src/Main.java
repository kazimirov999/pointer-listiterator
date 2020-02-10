import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CarDataBase carDataBase = new CarDataBase();
        carDataBase.setCarList();

        while (true) {
            String input = reader.readLine().toLowerCase();
            if (input.equals("exit")) {break;}
            else {
                switch (input) {
                    case "findbybodytype":
                        System.out.println("Enter the type of the body");
                        for (Object x: carDataBase.findByBodyType(reader.readLine())){
                            System.out.println(x);}
                        break;
                    case "removecarbybodycolor":
                        System.out.println("Enter the body color");
                        for (Object x: carDataBase.removeCarByBodyColor(reader.readLine())){
                            System.out.println(x);}
                        break;
                    case "сhangewheelbydiameter":
                        System.out.println("Enter minDiameter and maxDiameter");
                        for (Object x: carDataBase.сhangeWheelByDiameter(
                                Integer.parseInt(reader.readLine()),
                                Integer.parseInt(reader.readLine()))){
                            System.out.println(x);}
                        break;
                    case "removecarbybodytypeandwheelsdiameter":
                        System.out.println("Enter the type of the body, minDiameter and maxDiameter");
                        for (Object x: carDataBase.removeCarByBodyTypeAndWheelsDiameter(
                                reader.readLine(),
                                Integer.parseInt(reader.readLine()),
                                Integer.parseInt(reader.readLine()))){
                            System.out.println(x);}
                        break;
                    case "indexcarbybodytype":
                        System.out.println("Enter the type of the body");
                        System.out.println(carDataBase.indexCarByBodyType(reader.readLine()));
                        break;
                    default:
                        System.out.println("Choose one of the available methods " + "\n" +
                                "- findByBodyType        --> Шукає машини, які мають введений діаметр коліс" + "\n" +
                                "- removeCarByBodyColor  --> Шукає машини, які мають введений діаметр коліс та колір кузова" + "\n" +
                                "- сhangeWheelByDiameter --> Замінює в усіх машинах, які мають червоний колір кузова, кермо на інше" + "\n" +
                                "- removeCarByBodyTypeAndWheelsDiameter --> Збільшує діаметр коліс вдвічі, якщо кермо має кнопочки" + "\n" +
                                "- indexCarByBodyType    --> Замінює усі машини, які мають колеса діаметром менші за введене значення, на інші машини.\n" +
                                "- exit                  --> Зупиняє роботу з базою");
                        break;
                }
            }
        }
    }
}

