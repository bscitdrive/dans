package equationsolver;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Equation extends Remote {
    // Method to solve (a-b)^2
    int solveEquation(int a, int b) throws RemoteException;
}
