import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App_Client {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("locahost",8888);
			System.out.print("connected!");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buff = new BufferedReader(inReader);
			 
			System.out.print(buff.readLine());
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
