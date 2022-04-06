import java.net.ServerSocket;
import java.net.Socket;
public class Math_Server {
	public static void main(String[] args) {
		try {
			ServerSocker svSocket= new ServerSocket(8888);
			System.out.println("Server is connecting");
			Socket socket= svSocket.accept();
			System.out.println("Server connected");
			
		} catch (Exception e) {
		}
	}

}
