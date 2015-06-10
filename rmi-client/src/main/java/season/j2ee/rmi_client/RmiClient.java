package season.j2ee.rmi_client;

import java.rmi.Naming;
import season.j2ee.rmi.server.RemoteService;

public class RmiClient {
	public static void main(String[] args) {
		try {
			RemoteService rs = (RemoteService) Naming.lookup("rmi://localhost:6600/RemoteService");
			System.out.println(rs.responseMsg());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
