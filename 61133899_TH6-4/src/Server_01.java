import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_01 {

private static ServerSocket serverSocket = null;
public static void main(String[] args) throws IOException{

    DataOutputStream dos = null;
    DataInputStream dis=null;
    try {
        serverSocket = new ServerSocket(8888);
        System.out.print("Server ss\n" );
        Socket clientSocket = null;
        clientSocket = serverSocket.accept();
        dos=new DataOutputStream(clientSocket.getOutputStream());
        dis=new DataInputStream(clientSocket.getInputStream());
        String inline="";

        while(true)
        {
            inline = dis.readUTF();
            char ch[]=inline.toCharArray();
            if(Character.isDigit(ch[0]))
                {
                int i=Integer.parseInt(inline);
                Scanner sc = new Scanner(System.in);
                String rep = sc.next();
                if (rep.equalsIgnoreCase("0")) {
					System.out.println("---Phiên kết thúc---");
					break;
				}
                switch(i)
                {
                    
                    case 1:inline="1.txt";
                    break;
                    case 2:inline="2.txt";
                    break;
                    case 3:inline="3.txt";
                    break;
                    case 4:inline="4.txt";
                    break;
                    case 5:inline="5.txt";
                    break;
                    case 6:inline="6.txt";
                    break;
                    case 7:inline="7.txt";
                    break;
                    case 8:inline="8.txt";
                    break;
                    case 9:inline="9.txt";
                    break;
                    case 10:inline="10.txt";
                    break;  
                }
                dos.writeUTF(inline);
            }
        }

    }
    catch(Exception e) {
        dos.close();
        serverSocket.close();
        dis.close();
        System.out.print(e.getMessage());

    }

}

} 