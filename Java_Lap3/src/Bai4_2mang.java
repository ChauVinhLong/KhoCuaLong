import java.util.Arrays;
import java.util.Scanner;

public class Bai4_2mang {
	public static void sortsv(String sv[], float diemsv[]) {
		for (int i=0; i < sv.length-1; i++) {
			for (int j=0; j < sv.length-1; j++) {
				if (diemsv[i]>diemsv[j]) {
					float temp = diemsv[i];
					diemsv[i]=diemsv[j];
					diemsv[j]= temp;
					String svTemp = sv[i];
					sv[i]=sv[j];
					sv[j]= svTemp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String sv[]=new String[4];
		float diemsv[] = new float[4];
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<4;i++) {
			System.out.printf("Nhap ten sinh vien thu [%d]", i+1,scanner);
			sv[i]= scanner.nextLine();
			System.out.printf("Nhap diem sinh vien thu [%d]", i+1);
			diemsv[i]=scanner.nextFloat();	
			scanner.nextLine();
		}
		System.out.println("Mang sinh vien: "+ Arrays.toString(sv));
		System.out.println("Mang diem sinh vien: "+ Arrays.toString(diemsv));
		sortsv(sv, diemsv);
		for (int i=0; i < 4; i++) {
			System.out.println("Ho ten: "+ sv[i]);
			System.out.println("Diem: "+ diemsv[i]);
			if (diemsv[i] >=9 ) {
				System.out.println("Hoc luc xuat xac!");				
			}else if (diemsv[i] >=7.5 ) {
				System.out.println("Hoc luc gioi !");	
			}else if (diemsv[i] >=6.5 ) {
				System.out.println("Hoc luc kha !");	
			}else if (diemsv[i] >=5 ) {
				System.out.println("Hoc luc trung binh !");	
			}else {
				System.out.println("Hoc luc yeu !");	
			}
			System.out.println();
		}
	}

}
