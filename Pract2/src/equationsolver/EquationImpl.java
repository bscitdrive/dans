package equationsolver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class EquationImpl extends UnicastRemoteObject implements Equation {
    protected EquationImpl() throws RemoteException {
        super();
    }
    // Logic for (a - b)^2 = a^2 - 2ab + b^2
    @Override
    public int solveEquation(int a, int b) throws RemoteException {
        return (a * a) - (2 * a * b) + (b * b);
    }
}
