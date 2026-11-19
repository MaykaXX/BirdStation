package util;

public class Log {
    private Log() {}

    public static void log(String source, String event) {
        System.out.printf(source, event);
    }
}
