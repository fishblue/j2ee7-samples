package season.j2ee.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteServer {
	public static void main(String[] args) {
		try {
			RemoteService rs = new RemoteServiceImpl();
			LocateRegistry.createRegistry(6600);
			Naming.bind("rmi://localhost:6600/RemoteService", rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
