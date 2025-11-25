package stringservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringService extends Remote {
    int length(String s) throws RemoteException;
    String reverse(String s) throws RemoteException;
    String concat(String s1, String s2) throws RemoteException;
    String toUpper(String s) throws RemoteException;
    String toLower(String s) throws RemoteException;
    String substring(String s, int start, int end) throws RemoteException;
}
