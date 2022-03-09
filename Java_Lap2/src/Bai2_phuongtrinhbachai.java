import java.util.Scanner;

public class Bai2_phuongtrinhbachai {
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
	
	public static void phuongtrinhbachai (Float a, Float b, Float c) {
		if (a==0) {
			phuongtrinhbacnhat(a, b); 
		}else{
			float delta = (float) Math.pow(b, 2) - 4 * a * c;
			if ( delta < 0) {
			
			System.out.println("Phuong trinh vo nghiem");
			}else if (delta == 0) {
				float x = -b / 2*a;
				System.out.println("Phuong trinh co nghiem kep: "+x);
			}else {
				System.out.println("Phuong trinh co hai nghiem phan biet: ");
				float x1 = (- b + (float) Math.sqrt(delta)) / ( 2 * a );
				float x2 = (- b - (float) Math.sqrt(delta)) / ( 2 * a );
				
				System.out.printf("Nghiem x1= %.1f", x1);
				System.out.printf("\nNghiem x2= %.1f", x2);
				} 		
			}	
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b, c ;
		
		System.out.print("nhap a: ");
		a = scanner.nextFloat();
		
		System.out.print("nhap b: ");
		b = scanner.nextFloat();
		
		System.out.print("nhap c: ");
		c = scanner.nextFloat();
		
		phuongtrinhbachai(a, b, c);
		System.out.printf("Ket thuc",scanner);
		}	
	}
