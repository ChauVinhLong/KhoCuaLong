import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		float dai, rong;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cạnh thứ nhất: ");
		dai = scanner.nextFloat();
		
		System.out.print("Cạnh thứ hai: ");
		rong = scanner.nextFloat();
		
		float chuvi = (dai+rong)*2;
		float dientich = dai*rong;
		float canhnhonhat = Math.min(dai, rong);
		
		System.out.println("=============================");
		System.out.printf("Chu vi = %.1f", chuvi);
		System.out.printf("\nDiện tích = %.1f", dientich);
		System.out.printf("\nCạnh nhỏ nhất = %.1f", canhnhonhat, scanner);
	}

}
