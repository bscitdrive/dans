package calci;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

	public static void main(String[] args) {
		try {
			Calculator calculator= new CalculatorImplementation();
			Registry registry=LocateRegistry.createRegistry(1099);
			registry.rebind("CalculatorServer", calculator);
			System.out.println("Calculator RMI Server is Running....");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
