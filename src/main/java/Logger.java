public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.printf("[%d] %s\n", num++, msg);
    }

    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }
}
