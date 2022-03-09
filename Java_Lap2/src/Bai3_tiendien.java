import java.util.Scanner;

public class Bai3_tiendien {
	public static void tinhtiendien() {
		float sodien, tiendien;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nnhap so dien: ");
		sodien = scanner.nextFloat();
		
		if(sodien<=50){
			tiendien = sodien*100;	
		}else {
			tiendien = 50*1000 + (sodien - 50)*1200;
		}
		System.out.printf("Tien dien:%f ",tiendien , scanner);
	}
	public static void main(String[] args) {
		tinhtiendien();
		tinhtiendien();
	}

}
