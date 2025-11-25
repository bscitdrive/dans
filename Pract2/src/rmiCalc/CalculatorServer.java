package rmiCalc;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class CalculatorServer {
	public static void main(String[] args) {
		try {
			Calculator calc=new CalculatorImplementation();
			Registry registry=LocateRegistry.createRegistry(1234);
			registry.rebind("CalculatorService", calc);
			System.out.println("Calculator RMI is running...");	
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
