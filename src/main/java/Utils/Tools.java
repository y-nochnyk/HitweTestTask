package Utils;
import java.util.concurrent.TimeUnit;

public class Tools {

    public static void waitSec(){
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
