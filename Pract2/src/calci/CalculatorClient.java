package calci;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator calculator = (Calculator) registry.lookup("CalculatorServer");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter Operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;
            switch (op) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.sub(num1, num2);
                    break;
                case '*':
                    result = calculator.mul(num1, num2);
                    break;
                case '/':
                    result = calculator.div(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
