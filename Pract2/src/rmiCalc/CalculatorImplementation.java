package rmiCalc;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorImplementation extends UnicastRemoteObject implements Calculator {
	protected CalculatorImplementation() throws RemoteException{
		super();
	}	
	public double add(double a, double b) throws RemoteException {
		return a+b;
	}	
	public double subtract(double a, double b) throws RemoteException {
		return a-b;
	}	
	public double multiply(double a, double b) throws RemoteException {
		return a*b;
	}	
	public double divide(double a, double b) throws RemoteException {
		if(b==0) 
			throw new ArithmeticException("Divide by zero");
		return a/b;
	}		
}
