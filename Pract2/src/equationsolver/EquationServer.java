package equationsolver;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class EquationServer {
    public static void main(String[] args) {
        try {
            Equation equationObj = new EquationImpl();
            Registry registry = LocateRegistry.createRegistry(1092);
            registry.rebind("EquationService", equationObj);
            System.out.println("Equation Solver RMI Server is Running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
