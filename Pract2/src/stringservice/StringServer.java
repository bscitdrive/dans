package stringservice;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StringServer {
    public static void main(String[] args) {
        try {
            StringService service = new StringServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1092);
            registry.rebind("StringService", service);
            System.out.println("String RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
