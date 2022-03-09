import java.util.Scanner;

public class Bai1_songuyento {
	public static void main(String[] args) {
		int n;
		boolean ok = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n:");
		n = sc.nextInt();
		
		for (int i=2; i< n - 1;i++) {
			if (n % i ==0) {
				ok = false;
				break;
			}
		}
		if (ok == true) {
			System.out.printf(""+ n +" la so nguyen to",sc);			
		}else {
			System.out.printf(""+ n +" khong la so nguyen to",sc,ok);
		}
		}
	}
