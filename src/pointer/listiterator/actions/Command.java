package pointer.listiterator.actions;

public enum Command {
    CREATE("add"), READ("show"), UPDATE("update"), DELETE("rm"), DONE("done"), HELP("help");

    private String command;

    Command(String command) {
        this.command = command;
    }

    public static boolean hasValue(String value) {
        Command[] commands = Command.values();
        String valueUp = value.trim().toUpperCase();

        for (Command c : commands) {
            if (c.name().equals(valueUp) || c.command.equals(value)) {
                return true;
            }
        }

        return false;
    }

    public String getCommand() {
        return command;
    }

    public static Command toEnum(String value) {
        Command[] commands = Command.values();

        for (Command c : commands) {
            if (c.command.equals(value)) {
                return c;
            }
        }

        return valueOf(value.trim().toUpperCase());
    }
}
