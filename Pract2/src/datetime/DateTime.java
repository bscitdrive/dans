package datetime;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface DateTime extends Remote {
    String date() throws RemoteException;
    String time() throws RemoteException;
}
