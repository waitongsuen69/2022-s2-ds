import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;

public class Server implements Hello {
    public String sayHi() {
        return "hey dude ^_^";
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hi", stub);

            System.err.println("Server go");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
