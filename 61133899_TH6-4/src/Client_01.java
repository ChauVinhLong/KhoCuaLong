import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client_01{

    public static void main(String[] args) throws IOException{
        Socket mySocket = null;
        DataOutputStream dos = null;
        DataInputStream dis=null;

        try {

            mySocket = new Socket("localhost", 8888);
            System.out.print("Client 8888 ss\n");
            dos = new DataOutputStream(mySocket.getOutputStream());
            dis = new DataInputStream(mySocket.getInputStream());
            Scanner input = new Scanner(System.in);
            String s = null;
            while(true)
            {
                System.out.print("\nClient: ");
                s =input.nextLine();
                dos.writeUTF(s);
               
                String str=dis.readUTF();
                System.out.print("Server : "+str);
                
            }
        }
        catch(Exception e) {
            System.out.print("Ngat ket noi");
            dis.close();
            dos.close();
            mySocket.close();
            e.printStackTrace();

        }

    }

}