import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;

public class App_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket socketServer=new ServerSocket(8888);
			System.out.println("I`m listening on 8889 port.....");
			while (true)
			{
				SocKet socketClient = socketServer.accept();
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				write2Client.write("Xin chao \n");
				socketClient.close();
			}
			//socketServer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
