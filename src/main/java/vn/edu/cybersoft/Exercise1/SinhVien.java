package vn.edu.cybersoft.Exercise1;

import vn.edu.cybersoft.Exercise1.validator.SinhVienValidator;

public class SinhVien {
    private String hoTen;
    private String maSinhVien;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSinhVien, double diemToan, double dieLy, double diemHoa) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.diemToan = diemToan;
        this.diemLy = dieLy;
        this.diemHoa = diemHoa;
    }

    public double diemTrungBinh () {
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }

    public String xepLoai() {
        double diemTrungBinh = diemTrungBinh();
        if (diemTrungBinh < 5) {
            return "Yếu";
        } else if (diemTrungBinh < 6.5) {
            return "Trung bình";
        } else if (diemTrungBinh < 8) {
            return "Khá";
        } else if (diemTrungBinh < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
}
