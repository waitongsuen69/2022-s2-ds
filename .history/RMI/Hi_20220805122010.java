package Server.java;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hi extends Remote {
    String sayHi() throws RemoteException;
}
