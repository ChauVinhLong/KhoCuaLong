import java.util.Scanner;

public class Bai1_phuongtrinhbacnhat {

	public static void phuongtrinhbacnhat (Float a, Float b) {
		if (a==0) {
			if (b==0) {
				System.out.println("phuong trinh vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else{
			float nghiem = -b/a;
			System.out.println("Phuong trinh co mot nghiem: "+nghiem);
			}
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b;
		
		System.out.print("nhap a: ");
		a = scanner.nextFloat();
		
		System.out.print("nhap b: ");
		b = scanner.nextFloat();
		
		phuongtrinhbacnhat(a, b); 
		System.out.printf("Ket thuc",scanner);
		}	
	}

