import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		float a, b ,c ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap a: ");
		a = scanner.nextFloat();
		
		System.out.print("nhap b: ");
		b = scanner.nextFloat();
		
		System.out.print("nhap c: ");
		c = scanner.nextFloat();
		
		float delta = (float) Math.pow(b, 2) - 4 * a * c;
		float sqrt = (float) Math.sqrt(delta);
		
		System.out.println("=================================");
		
		System.out.printf("Delta = %f", delta);
		System.out.printf("\nsqrt delta = %f", sqrt, scanner);
	}

}
