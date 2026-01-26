public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        // Sử dụng Setter để đảm bảo logic kiểm tra 0-10 được áp dụng ngay khi khởi tạo
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public void setDiemToan(double diem) {
        if (checkDiemHopLe(diem)) {
            this.diemToan = diem;
        } else {
            System.out.println("❌ Lỗi: Điểm Toán (" + diem + ") không hợp lệ (0-10). Gán mặc định = 0.");
            this.diemToan = 0;
        }
    }

    public void setDiemVan(double diem) {
        if (checkDiemHopLe(diem)) {
            this.diemVan = diem;
        } else {
            System.out.println("❌ Lỗi: Điểm Văn (" + diem + ") không hợp lệ (0-10). Gán mặc định = 0.");
            this.diemVan = 0;
        }
    }

    public void setDiemAnh(double diem) {
        if (checkDiemHopLe(diem)) {
            this.diemAnh = diem;
        } else {
            System.out.println("❌ Lỗi: Điểm Anh (" + diem + ") không hợp lệ (0-10). Gán mặc định = 0.");
            this.diemAnh = 0;
        }
    }


    private boolean checkDiemHopLe(double diem) {
        return diem >= 0 && diem <= 10;
    }


    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }


    public String xepLoai() {
        double dtb = tinhDiemTB();

        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }


    public void hienThiThongTin() {
        double dtb = tinhDiemTB();
        System.out.println("---------------------------");
        System.out.println("Học sinh: " + hoTen);
        System.out.printf("Điểm: Toán %.1f - Văn %.1f - Anh %.1f\n", diemToan, diemVan, diemAnh);
        System.out.printf(">> Điểm TB: %.2f\n", dtb);
        System.out.println(">> Xếp loại: " + xepLoai());
        System.out.println("---------------------------");
    }
}

