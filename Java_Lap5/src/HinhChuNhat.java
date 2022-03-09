
public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat(){		
	}
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai=chieuDai;
		this.chieuRong=chieuRong;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai=chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong=chieuRong;
	}
	public double getChuVi() {
		return 2 * (getChieuDai()+ getChieuRong());
	}
	public double getDienTich() {
		return getChieuDai() * getChieuRong();
	}
	public void xuat() {
		System.out.println("Chieu dai: "+ getChieuDai());
		System.out.println("Chieu rong: "+ getChieuRong());
		System.out.println("Chu vi: "+ getChuVi());
		System.out.println("Dien tich: "+ getDienTich());
	}
}

