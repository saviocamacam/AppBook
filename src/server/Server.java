package server;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    public static void main(String args[]) {
        try {
            if(System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            AppBookInterface a = new AppBook();
            Registry registry = LocateRegistry.getRegistry("localhost");
            registry.bind("AppBook", a);
            
            System.out.println("Server Ready");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}