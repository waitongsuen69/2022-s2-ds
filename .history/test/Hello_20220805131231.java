// package Server.java;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String sayHi() throws RemoteException;
}
