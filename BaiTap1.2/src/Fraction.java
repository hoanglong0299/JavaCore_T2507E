import java.util.Scanner;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction(){
        this.tuSo =0;
        this.mauSo =1;
    }
    public Fraction(int tuSo, int mauSo){
        if (mauSo == 0){
            System.out.println("Mẫu số không thể băng 0");
            this.mauSo =1;
        }else{
            this.mauSo = mauSo;
        }
        this.tuSo= tuSo;
    }
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mẫu số không thể bằng 0!");
        } else {
            this.mauSo = mauSo;
        }
    }
    public void nhapPhanSo(Scanner sc) {
        System.out.print("Nhập tử số: ");
        this.tuSo = sc.nextInt();
        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            this.mauSo = sc.nextInt();
            if (this.mauSo == 0) {
                System.out.println("Mẫu số phải khác 0. Vui lòng nhập lại.");
            }
        } while (this.mauSo == 0);
    }
    public void inPhanSo() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }
    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    // 5. Phương thức rút gọn phân số
    public void rutGon() {
        if (tuSo == 0) {
            mauSo = 1; // 0/x thì rút gọn thành 0/1
            return;
        }

        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        // Đưa dấu trừ lên tử số nếu mẫu số âm
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // 6. Phương thức nghịch đảo phân số
    public void nghichDao() {
        if (tuSo == 0) {
            System.out.println("Không thể nghịch đảo phân số có tử bằng 0.");
            return;
        }
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
        // Xử lý dấu sau khi nghịch đảo (để mẫu luôn dương cho đẹp)
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // 7. Các phép toán Cộng, Trừ, Nhân, Chia
    // Các hàm này trả về một đối tượng PhanSo mới là kết quả

    public Fraction add(Fraction ps2) {
        int tuMoi = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        Fraction ketQua = new Fraction(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public Fraction sub(Fraction ps2) {
        int tuMoi = this.tuSo * ps2.mauSo - ps2.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        Fraction ketQua = new Fraction(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public Fraction mul(Fraction ps2) {
        int tuMoi = this.tuSo * ps2.tuSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        Fraction ketQua = new Fraction(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public Fraction div(Fraction ps2) {
        if (ps2.tuSo == 0) {
            System.out.println("Không thể chia cho 0.");
            return new Fraction(0, 1);
        }
        int tuMoi = this.tuSo * ps2.mauSo;
        int mauMoi = this.mauSo * ps2.tuSo;
        Fraction ketQua = new Fraction(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
}

