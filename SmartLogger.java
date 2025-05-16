import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private int n = 1;
    private String error = "ERROR";
    private String info = "INFO";

    @Override
    public void log(String msg) {
        if(msg.contains("error") || msg.contains("ERROR") ){
            System.out.print(error);
        }
        else {
            System.out.print(info);
        }
        System.out.println("#"+n+" [" + LocalDateTime.now() + "] <" + msg + ">");
        n = n + 1;
    }
}
