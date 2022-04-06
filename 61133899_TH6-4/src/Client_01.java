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
        //Scanner sc = new Scanner(System.in);

        try {

            mySocket = new Socket("localhost", 8888);
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
                
                //System.out.println("\nNhập 0 để kết thúc phiên");
				//String rep = sc.next();
				//if (rep.equalsIgnoreCase("0")) {
					//System.out.println("---Phiên kết thúc---");
					//break;
				//}
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