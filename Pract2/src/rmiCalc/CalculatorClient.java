package rmiCalc;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class CalculatorClient {
	public static void main(String[] args) throws AccessException, RemoteException, NotBoundException {
		Registry registry=LocateRegistry.getRegistry("localhost",1234);
		Calculator calculator=(Calculator)registry.lookup("CalculatorService");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		double a=sc.nextDouble();
		System.out.print("Enter second number:");
		double b=sc.nextDouble();
		System.out.print("Enter operator(+,-,*,/):");
		char op=sc.next().charAt(0);		
		double result=0;
		switch(op) {
		case '+':
			result=calculator.add(a, b);
			break;
		case '-':
			result=calculator.subtract(a, b);
			break;
		case '*':
			result=calculator.multiply(a, b);
			break;
		case '/':
			result=calculator.divide(a, b);
			break;
		default:
			System.out.println("Invalid operator");			
		}
		System.out.println("Answer:"+result);
	}
}
