public class Main {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien("A001","Nguyễn Duy Nam",25,8.2);

        sv1.inThongTin();

        TaiKhoan tk = new TaiKhoan("999888", "Nguyen Van A", 1000000);

        HocSinh hs1 = new HocSinh("Nguyen Van A", 9.0, 8.5, 8.0);
        hs1.hienThiThongTin();

    }
}
