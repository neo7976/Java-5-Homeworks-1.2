import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    protected int num = 1;

    public void log(String msg) {
        System.out.printf("[Date: %-30s %d] %s\n", dtf.format(LocalDateTime.now()),num++, msg);
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
