import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Họ tên: ");
		String hoten = scanner.nextLine();
		
		System.out.print("Điểm: ");
		Double diemTB = scanner.nextDouble();
		
		System.out.println("====================");
		
		System.out.printf("%s: %.1f điểm", hoten, diemTB, scanner);
		}

}
