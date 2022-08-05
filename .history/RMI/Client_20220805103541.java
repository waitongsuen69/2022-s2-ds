import java.rmi.registry.LocalRegistry;
import java.rmi.registry.Registry;

public class Client {
    private client(){ }

    public static void main(String[] args){
        String host = (args.length < 1)? null : args[0];
        try{
            Registry registry = LocateRegistry.getRegistry(host);
        }
    }

}
