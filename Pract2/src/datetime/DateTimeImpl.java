package datetime;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.LocalTime;
public class DateTimeImpl extends UnicastRemoteObject implements DateTime{
	public DateTimeImpl() throws RemoteException {
		super();
	}
	public String date() throws RemoteException {
		return LocalDate.now().toString();
    }
    public String time() throws RemoteException {
    	return LocalTime.now().withNano(0).toString();
    }
}
