import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client_BMI_61133899 {

	public static void main(String[] args) {
		Socket soc;
		try {
			soc = new Socket("localhost", 8989);
			System.out.print("Connected!\n");
			//Lấy luồng nhập
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2Client);
			
			//Lấy luồng nhập từ bàn phím
			Scanner banPhim= new Scanner(System.in);
			
			// Giao tiep theo giao thuc thiet ke ============
			String chuoiHello_Nhan = buffRead.readLine();
			System.out.print("\nBMI server1:" +chuoiHello_Nhan);	
			System.out.print("\nBMI client2: ");
			String chuoiXinChao_Gui= banPhim.nextLine();
			buffWrite.write(chuoiXinChao_Gui+"\n");
			buffWrite.flush();
			//----------------
			String chuoihoiTen_Nhan = buffRead.readLine();
			System.out.print("\nBMI server3:" +chuoihoiTen_Nhan);
			System.out.print("\nBMI client4: (Nhap ten ban): ");
			String chuoiTen_Gui= banPhim.nextLine();
			buffWrite.write(chuoiTen_Gui);
			buffWrite.flush();
			//-----------------
			
			//Nhan hoi chieu cao
			String chuoiHoiChieuCao_Nhan = buffRead.readLine();
			System.out.print("\nBMI server5:"+chuoiHoiChieuCao_Nhan);
			System.out.print("\nBMI client6: (Nhap chieu cao (cm): ");
			String chuoiTraloiChieuCao_Gui = banPhim.nextLine();
			buffWrite.write(chuoiTraloiChieuCao_Gui);
			buffWrite.flush();
			//----------------
			
			//Nhan hoi can nang
			String chuoihoiCanNang_Nhan = buffRead.readLine();
			System.out.print("BMI server:"+ chuoihoiCanNang_Nhan);
			System.out.print("BMI client: (Nhap can nang (kg): ");
			String chuoiTraloiCanNang_Gui = banPhim.nextLine();
			// Gui den Server
			buffWrite.write(chuoiTraloiCanNang_Gui);
			buffWrite.flush();
			//----------------
			
		
            // ========================================
			} catch( IOException e) {
				// 
					e.printStackTrace();
			}
		}
}