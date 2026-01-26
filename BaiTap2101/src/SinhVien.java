public class SinhVien {
    private String maSV;
    private String hovaTen;
    private int tuoi;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hovaTen , int tuoi, double diemTB ) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.hovaTen = hovaTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHovaTen() {
        return hovaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHovaTen(String hovaTen) {
        this.hovaTen = hovaTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public void inThongTin(){
        System.out.println("Thông tin sinh viên");
        System.out.println("Mã Sinh viên:"+ maSV);
        System.out.println("Họ và tên:"+hovaTen);
        System.out.println("Tuổi:"+tuoi);
        System.out.println("Điểm trung bình:"+diemTB);
    }
}
