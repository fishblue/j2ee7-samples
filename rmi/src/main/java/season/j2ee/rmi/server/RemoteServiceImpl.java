package season.j2ee.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService{
	protected RemoteServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -5975899476054586317L;
	public String responseMsg() throws RemoteException{
		// TODO Auto-generated method stub
		return "this is a string from remote server!";
	}

}
