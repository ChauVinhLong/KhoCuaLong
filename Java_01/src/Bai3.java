import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		float canh;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Canh = ");
		canh = scanner.nextFloat();
		
		float thetich = canh*canh*canh;
		
		System.out.println("======================");
		System.out.printf("The tich lap phuong = %.1f",thetich, scanner);
	}

}
