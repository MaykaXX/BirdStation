public class Log {
    private static long number;

    private Log(){}

    public static void log(String sourse, String event){
        number++;
        System.out.println("[" + sourse + "]" + ": " + event);
    }
}
