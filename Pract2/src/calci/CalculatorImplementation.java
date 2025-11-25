package calci;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplementation extends UnicastRemoteObject implements Calculator {

   
    public CalculatorImplementation()
            throws RemoteException {
        super();
    }

    public double add(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }

   
    public double sub(double num1, double num2) throws RemoteException {
        return num1 - num2;
    }

   
    public double mul(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }

    
    public double div(double num1, double num2) throws RemoteException {
        if (num2 == 0) {
            throw new RemoteException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
