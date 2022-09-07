public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.printf("[%d] %s\n", num++, msg);
    }
}
