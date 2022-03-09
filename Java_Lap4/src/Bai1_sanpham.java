import java.util.Scanner;

public class Bai1_sanpham {
		private String tenSP;
	    private double donGia;
	    private double giamGia;
	    
	    public String getTenSP() {
	    	return tenSP;
	    }
	    public void setTenSP(String tenSP) {
	    	this.tenSP = tenSP;
	    }
	    public double getDonGia() {
	    	return donGia;
	    }
	    public void setDonGia(Double donGia) {
	    	this.donGia = donGia;
	    }
	    
	    public Bai1_sanpham(String tenSP, double donGia, double giamGia) {
	    	this.tenSP = tenSP;
	    	this.donGia = donGia;
	    	this.giamGia = giamGia;
	    }
	    public Bai1_sanpham(String tenSP, double donGia) {
	    	this.tenSP = tenSP;
	    	this.donGia = donGia;
	    	this.giamGia = 0;
	    }
	    
	    private double getThueNhapKhau() {
		return donGia*0.1;	
		}		
	    public void xuat() {
	    	System.out.printf("\nTen san pham: %.3s|Don gia: %.3f|Giam gia: %.3f| Thue nhap khau: %.3f", tenSP, donGia, giamGia, getThueNhapKhau());
	    }
	    public void nhap() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nNhap ten san pham: ");
		tenSP = s.nextLine();
		
		System.out.print("Nhap don gia: ");
		donGia = s.nextDouble();
		
		System.out.print("Nhap giam gia: ");
		giamGia = s.nextDouble();		
	}
		
}
