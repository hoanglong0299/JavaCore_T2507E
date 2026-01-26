import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo phân số 1
        System.out.println("--- Nhập phân số thứ 1 ---");
        Fraction ps1 = new Fraction();
        ps1.nhapPhanSo(sc);
        System.out.print("Phân số 1 sau khi rút gọn: ");
        ps1.rutGon();
        ps1.inPhanSo();

        // Tạo phân số 2
        System.out.println("\n--- Nhập phân số thứ 2 ---");
        Fraction ps2 = new Fraction();
        ps2.nhapPhanSo(sc);
        System.out.print("Phân số 2 sau khi rút gọn: ");
        ps2.rutGon();
        ps2.inPhanSo();

        // Kiểm tra các phép toán
        System.out.println("\n--- Kết quả tính toán ---");

        Fraction tong = ps1.add(ps2);
        System.out.print("Tổng (ps1 + ps2) = ");
        tong.inPhanSo();

        Fraction hieu = ps1.sub(ps2);
        System.out.print("Hiệu (ps1 - ps2) = ");
        hieu.inPhanSo();

        Fraction tich = ps1.mul(ps2);
        System.out.print("Tích (ps1 * ps2) = ");
        tich.inPhanSo();

        Fraction thuong = ps1.div(ps2);
        System.out.print("Thương (ps1 / ps2) = ");
        thuong.inPhanSo();

        // Kiểm tra nghịch đảo
        System.out.println("\n--- Nghịch đảo phân số 1 ---");
        ps1.nghichDao();
        System.out.print("Phân số 1 sau khi nghịch đảo: ");
        ps1.inPhanSo();

        sc.close();
    }
}