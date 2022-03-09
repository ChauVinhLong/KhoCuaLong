import java.util.Scanner;

public class Bai4_menu {
	public static void menu() {
		System.out.println("--------------------------------");
		System.out.println("1. Giai phuong trinh bac hat");
		System.out.println("2. Giai phuong trinh bac hai");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Thoat chuong trinh");
		System.out.println("--------------------------------");
		System.out.println("---------Chon chuc nang---------");
		Scanner scanner = new Scanner(System.in);
		int chon = scanner.nextInt();
		switch (chon) {
		case 1:
			System.out.print("nhap a: ");
			float a = scanner.nextFloat();
			System.out.print("nhap b: ");
			float b = scanner.nextFloat();
			Bai1_phuongtrinhbacnhat.phuongtrinhbacnhat(a, b);
			break;
		case 2:
			System.out.print("nhap a: ");
			a = scanner.nextFloat();
			System.out.print("nhap b: ");
			b = scanner.nextFloat();
			System.out.print("nhap c: ");
			float c = scanner.nextFloat();
			Bai2_phuongtrinhbachai.phuongtrinhbachai(a, b, c);
			break;
		case 3:
			Bai3_tiendien.tinhtiendien();
			break;
		case 4:
			System.exit(0);	
		}
		System.out.printf("\nket thuc chuong trinh\n", scanner);
	}
	public static void main(String[] args) {
		System.out.print("==============long==============\n");
		menu();
		menu();
		menu();
		menu();
		menu();
	}
}
