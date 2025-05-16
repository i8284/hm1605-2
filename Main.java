public class Main {
    public static void main(String[] args) {

        SimpleLogger simpleLogger = new SimpleLogger();
        //simpleLogger.log("сообщение");

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("сообщение ERROR");
        smartLogger.log("сообщение1");
        smartLogger.log("сообщение2");

    }


}