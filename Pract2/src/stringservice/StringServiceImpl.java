package stringservice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService {

    protected StringServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int length(String s) throws RemoteException {
        return s.length();
    }

    @Override
    public String reverse(String s) throws RemoteException {
        return new StringBuilder(s).reverse().toString();
    }

    @Override
    public String concat(String s1, String s2) throws RemoteException {
        return s1 + s2;
    }

    @Override
    public String toUpper(String s) throws RemoteException {
        return s.toUpperCase();
    }

    @Override
    public String toLower(String s) throws RemoteException {
        return s.toLowerCase();
    }

    @Override
    public String substring(String s, int start, int end) throws RemoteException {
        return s.substring(start, end);
    }
}
