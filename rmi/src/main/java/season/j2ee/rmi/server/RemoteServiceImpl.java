package season.j2ee.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * 
 * @author Administrator
 *
 */
public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService{
	/**
	 * 序列码
	 */
	private static final long serialVersionUID = -5975899476054586317L;
	/**
	 * 构造函数
	 * @throws RemoteException
	 */
	protected RemoteServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 返回消息
	 */
	public String responseMsg() throws RemoteException{
		// TODO Auto-generated method stub
		return "this is a string from remote server!";
	}

}
