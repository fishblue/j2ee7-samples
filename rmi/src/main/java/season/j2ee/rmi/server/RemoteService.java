package season.j2ee.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 服务器类
 * @author Administrator
 *
 */
public interface RemoteService extends Remote{
	/**
	 * 方法
	 * @return 字符串
	 * @throws RemoteException
	 */
	public String responseMsg() throws RemoteException;
}
