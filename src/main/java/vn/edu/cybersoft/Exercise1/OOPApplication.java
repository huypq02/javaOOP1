package vn.edu.cybersoft.Exercise1;

import vn.edu.cybersoft.Exercise1.validator.SinhVienValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOPApplication {
    public static void main(String[] args) {
        try {
            SinhVien sv = new SinhVien();
            nhap(sv);
            xuat(sv);
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Du lieu nhap vao khong hop le");
            }
        }
    }

    public static void nhap(SinhVien sv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        sv.setHoTen(sc.nextLine());
        System.out.println("Nhap ma sinh vien: ");
        sv.setMaSinhVien(sc.nextLine());
        System.out.println("Nhap diem toan: ");
        sv.setDiemToan(sc.nextDouble());
        System.out.println("Nhap diem ly: ");
        sv.setDiemLy(sc.nextDouble());
        System.out.println("Nhap diem hoa: ");
        sv.setDiemHoa(sc.nextDouble());
        // validate
        SinhVienValidator.validate(sv.getHoTen(), sv.getMaSinhVien(), sv.getDiemToan(), sv.getDiemLy(), sv.getDiemHoa());
    }

    public static void xuat(SinhVien sv){
        System.out.println("Ho va ten: " + sv.getHoTen());
        System.out.println("Ma sinh vien: " + sv.getMaSinhVien());
        System.out.println("Diem trung binh: " + sv.diemTrungBinh());
        System.out.println("Xep loai: " + sv.xepLoai());
    }
}
