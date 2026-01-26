public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTK;
    private double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTaiKhoan, String chuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTK = chuTK;

        if (soDu <0){
            this.soDu=0;
            System.out.println("Số dư ban đầu không được âm");
        }else{
            this.soDu=soDu;
        }
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTK() {
        return chuTK;
    }

    public void setChuTK(String chuTK) {
        this.chuTK = chuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void napTien(double soTien){
        if(soTien <= 0){
            System.out.println("Số tiền nạp cần lớn hơn 0");
        }else{
            this.soDu += soTien;
            System.out.println("Nạp tiền thành công");
        }
    }

    public void rutTien(double soTien){
        if(soTien <= 0){
            System.out.println("Số tiền rút lớn hơn 0");
            return;
        }
        if(soTien > this.soDu){
            System.out.println("Số dư không đủ");
        }else{
            this.soDu -= soTien;
            System.out.println("Rút tiền thành công");
        }
    }
    public void hienThiSodu(){
        System.out.println("Thông tin tài khoản");
        System.out.println("Số tài khoản:"+ soTaiKhoan);
        System.out.println("Tên chủ tài khoản:"+chuTK);
        System.out.println("Số dư khả dụng:"+soDu);
    }
}
