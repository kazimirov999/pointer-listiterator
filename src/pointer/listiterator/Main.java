package pointer.listiterator;

import pointer.listiterator.actions.Command;
import pointer.listiterator.actions.ParameterizedCommand;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarManager manager = new CarManager();
        List<Car> carList = new LinkedList<>();
        ParameterizedCommand command = new ParameterizedCommand(System.in);

        manager.help();
        command.next();

        while (command.getCommand() != Command.DONE) {
            switch (command.getCommand()) {
                case CREATE:
                    manager.addCarToList(carList.listIterator(), command.getParams());
                    command.next();
                    break;

                case READ:
                    manager.doSearch(carList.listIterator(), command.getParams());
                    command.next();
                    break;

                case UPDATE:
                    manager.update(carList.listIterator(), command.getParams());
                    command.next();
                    break;

                case DELETE:
                    manager.remove(carList.iterator(), command.getParams());
                    command.next();
                    break;

                case HELP:
                    manager.help();
                    command.next();
                break;
            }

        }
        command.close();
    }
}