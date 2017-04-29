package cliente;

/**
 * Define a interface para uma calculadora remota
 * Autor: Sávio de Oliveira Camacam
 * Data: 27/04/2017 - 11 anos depois
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;

public interface AppBookInterface extends Remote {
    public boolean addCompromise(Compromise c) throws RemoteException;
    public boolean updateCompromise(Compromise c) throws RemoteException; 
    public boolean deleteCompromise(Compromise c) throws RemoteException;
    public LinkedList<Compromise> getCompromisesPerDate(String data) throws RemoteException;
    public LinkedList<Compromise> getCompromissos() throws RemoteException;
}
