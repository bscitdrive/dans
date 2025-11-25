package equationsolver;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class EquationClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1092);
            Equation eqService = (Equation) registry.lookup("EquationService");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();
            int result = eqService.solveEquation(a, b);
            System.out.println("Result of (" + a + " - " + b + ")^2 = " + result);
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
