public class Log {
    private static long number;

    private Log(){}

    public static void log(String source, String event){
        number++;
        System.out.println("[" + source + "]" + ": " + event);
    }
}
