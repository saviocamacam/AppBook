package server;

import cliente.Compromise;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;


public class AppBook extends UnicastRemoteObject implements AppBookInterface {
    private final LinkedList<Compromise> listOfCompromisses;
    
    public AppBook() throws RemoteException {
        super();
        this.listOfCompromisses = new LinkedList<Compromise>();
        System.out.println("Objeto remoto instanciado");
    }
    
    @Override
    public boolean addCompromise(Compromise c) throws RemoteException {
        return listOfCompromisses.add(c);
    }

    @Override
    public boolean updateCompromise(Compromise c) throws RemoteException {
        return addCompromise(c);
    }

    @Override
    public boolean deleteCompromise(Compromise c) throws RemoteException {
        return listOfCompromisses.remove(c);
    }

    @Override
    public LinkedList<Compromise> getCompromissosPorData(String data) throws RemoteException {
        LinkedList<Compromise> listPerDate = new LinkedList<Compromise>();
        for(Compromise c : listOfCompromisses) {
            if(c.getDate().equals(data)) {
                listPerDate.add(c);
            }
        }
        return listPerDate;
    }

    @Override
    public LinkedList<Compromise> getCompromissos() throws RemoteException {
        return listOfCompromisses;
    }
    
}
