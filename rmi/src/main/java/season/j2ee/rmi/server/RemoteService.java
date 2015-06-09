package season.j2ee.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteService extends Remote{
	public String responseMsg() throws RemoteException;
}
