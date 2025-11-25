package datetime;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class DateTimeClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1091);
            DateTime dt = (DateTime) registry.lookup("DateTimeServer");
            String currentDate = dt.date();
            String currentTime = dt.time();
            System.out.println("Current Date: " + currentDate);
            System.out.println("Current Time: " + currentTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
