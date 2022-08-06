
import java.rmi.server.UnicastRemoteObject;

// import Server.java.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
// import java.rmi.RemoteException;

public class Server implements Hi {
    public String sayHi() {
        return "hey dude ^_^";
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            Hi stub = (Hi) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hi", stub);

            System.err.println("Server go");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
