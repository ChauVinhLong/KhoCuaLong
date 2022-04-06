
import java.io.IOException;
import java.net.ServerSocket;

public class Server_01 {
	private static ServerSocket serverSocket = null;
	public static void main(String[] args) throws IOException{

		
		try {
	        serverSocket = new ServerSocket(8000);
	        System.out.print("Server ss\n" );
	       
	    }
	    catch(Exception e) {
	    	
	        serverSocket.close();

	        System.out.print(e.getMessage());

	    }
	}

}
