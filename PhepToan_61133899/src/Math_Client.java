import java.net.Socket;

public class Math_Client {
	public void main(String[] args) {
		try {
			System.out.println("Client is connecting ...");
			Socket socket = new Socket("localhost", 8888);
			System.out.println("Client connected");
		} catch (Exception e) {
		}
		
	}

}
