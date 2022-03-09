
public class MainClass extends Bai1_sanpham {
	public static void main(String[] args) {
		Bai1_sanpham sp1 = new Bai1_sanpham("Sp1",400,20);
		
		sp1.xuat();
		String ten = sp1.getTenSP();
		
		System.out.println("Ten san pham: "+ten);
		sp1.setTenSP("New");
		sp1.xuat();
		
		System.out.println("\n-------------------------------");
		
		Bai1_sanpham sp2;
		sp2=new Bai1_sanpham("Sp2",600);
		
		sp2.xuat();
	}
}
