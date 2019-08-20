package pointer.listiterator;

import pointer.listiterator.actions.CarBuilder;
import pointer.listiterator.actions.Changer;
import pointer.listiterator.actions.Deleter;
import pointer.listiterator.actions.Search;

import java.util.*;

public class CarManager {

    private static final String WITH = "with";
    private static final String WITHOUT = "without";

    private CarBuilder builder = new CarBuilder();
    private Search search = new Search();
    private Changer changer = new Changer();
    private Deleter remover = new Deleter();

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public void setChanger(Changer changer) {
        this.changer = changer;
    }

    public void setRemover(Deleter remover) {
        this.remover = remover;
    }

    public void help() {
        StringBuilder stringBuilder = new StringBuilder("Type 'add car brand, color, type and wheel diameter.\n");
        stringBuilder.append("Colors: ").append(Arrays.toString(Color.values())).append("\n")
                .append("Car types: ").append(Arrays.toString(BodyType.values())).append("\n")
                .append("Type 'show' without parameters OR with body type OR color OR diameter OR diameter and color\n")
                .append("show indexes - displays car indexes, shown by 'show body type'")
                .append("Type 'update' with:\n")
                .append("- 'with'/without': Make double diameter for cars 'with'/'without' buttons.\n")
                .append("- body color AND true/false AND float: Change steering wheel to wheel with/without buttons " )
                .append("(boolean) and with new diameter (floet) for cars with some color.\n")
                .append("- diameter: change cars with diameter smaller than entered.")
                .append("\n\n'rm' color OR 'rm' body type min-diameter max-diameter of steering wheel\n")
                .append("Type 'help' to show this\nType 'done' for finish.");

        System.out.println(stringBuilder);
    }

    public void addCarToList(ListIterator<Car> carListIterator, String[] params) {
        Car car = builder.buildNewCar(params[0], params[1], params[2], params[3]);

        if (car == null) {
            return;
        }

        System.out.println(car + " is added.");
        carListIterator.add(car);
    }

    public void doSearch(ListIterator<Car> carIterator, String[] params) {

        try {
            switch (params.length) {
                case 0:
                    System.out.println(search.display(carIterator));
                    break;
                case 1:
                    searchByOneParameter(carIterator, params[0]);
                    break;
                case 2:
                    searchByTwoParameters(carIterator, params[0], params[1]);
                    break;
                default:
                    System.out.println("Wrong parameters count.");
                    break;
            }
        } catch (NumberFormatException nex) {
            System.out.println("Wheel diameter should be float");
        }
    }

    public void update(ListIterator<Car> listIterator, String[] params) {
        String param = params[0];

        if (param.equals(WITH) || param.equals(WITHOUT)) {
            changer.makeDoubleWheelsDiameter(listIterator, param.equals(WITH));
            return;
        }

        if (Color.hasValue(param)) {
            changer.changeSteeringWheel(listIterator, Color.toEnum(param), Float.parseFloat(params[2]),
                    Boolean.parseBoolean(params[1]));
            return;
        }

        if (Color.hasValue(params[2]) && BodyType.hasValue(params[3])) {
            try {
                changer.changeCarsWithSmallDiameter(listIterator, Float.parseFloat(param), params);
            } catch (NumberFormatException nex) {
                System.out.println("Use float value as diameter.");
            }
        }

        try {
            changer.changeWheels(listIterator, Float.parseFloat(param), Float.parseFloat(params[1]), Boolean.parseBoolean(params[2]));
        } catch (NumberFormatException nex) {
            System.out.println("Use float value as diameter.");
        }


        System.out.println("Parameter '" + param + "' isn't allowed. Allowed 'with'/'without', one of colors: "
                + Arrays.toString(Color.values()));
    }

    public void remove(Iterator<Car> iterator, String[] params) {

        switch (params.length) {
            case 2:
                if (Color.hasValue(params[1])) {
                    remover.remove(iterator, Color.toEnum(params[1]));
                } else {
                    System.out.println("Parameter '" + params[1] + "' isn't allowed. Allowed colors: " +
                            Arrays.toString(Color.values()));
                }
                break;

            case 4:
                if (BodyType.hasValue(params[1])) {
                    try {
                        remover.remove(iterator, BodyType.toEnum(params[1]), Float.parseFloat(params[2]),
                                Float.parseFloat(params[3]));
                    } catch (NumberFormatException nex) {
                        System.out.println("Wrong format for diameter. Use float instead.");
                    }
                } else {
                    System.out.println("Parameter '" + params[0] + "' isn't allowed. Allowed body types: " +
                            Arrays.toString(BodyType.values()));
                }
                break;
        }
    }

    private void searchByOneParameter(ListIterator<Car> carIterator, String parameter) {
        if (parameter == null || parameter.equals("")) {
            System.out.println("Wrong parameters count. Expected one parameter.");
            return;
        }

        if (parameter.equals("indexes")) {
            System.out.println(search.getIndexes());
        }

        if (Color.hasValue(parameter)) {
            search.find(carIterator, Color.toEnum(parameter));
            return;
        }

        if (BodyType.hasValue(parameter)) {
            search.find(carIterator, BodyType.toEnum(parameter));
            return;
        }

        search.find(carIterator, Float.parseFloat(parameter));
    }

    private void searchByTwoParameters(Iterator<Car> carIterator, String color, String diameter) {
        if (Color.hasValue(color)) {
            search.find(carIterator, Float.parseFloat(diameter), Color.toEnum(color));
        } else {
            System.out.println("Color '" + color + "' isn't allowed. Allowed colors: "
                    + Arrays.toString(Color.values()));
        }
    }
}