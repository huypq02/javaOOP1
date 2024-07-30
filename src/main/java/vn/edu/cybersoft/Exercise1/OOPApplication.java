package vn.edu.cybersoft.Exercise1;

import vn.edu.cybersoft.Exercise1.validator.SinhVienValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static vn.edu.cybersoft.Exercise1.validator.SinhVienValidator.numberValidator;
import static vn.edu.cybersoft.Exercise1.validator.SinhVienValidator.stringValidator;

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
        if (!stringValidator(sv.getHoTen())){ // validate
            System.out.println("Ho va ten khong duoc de trong");
            System.exit(0);
        }

        System.out.println("Nhap ma sinh vien: ");
        sv.setMaSinhVien(sc.nextLine());
        if (!stringValidator(sv.getMaSinhVien())){ // validate
            System.out.println("Ma sinh vien khong duoc de trong");
            System.exit(0);
        }

        System.out.println("Nhap diem toan: ");
        sv.setDiemToan(sc.nextDouble());
        if (!numberValidator((sv.getDiemToan()))){ // validate
            System.out.println("Diem toan phai tu 0 den 10");
            System.exit(0);
        }

        System.out.println("Nhap diem ly: ");
        sv.setDiemLy(sc.nextDouble());
        if (!numberValidator((sv.getDiemLy()))){ // validate
            System.out.println("Diem ly phai tu 0 den 10");
            System.exit(0);
        }

        System.out.println("Nhap diem hoa: ");
        sv.setDiemHoa(sc.nextDouble());
        if (!numberValidator((sv.getDiemHoa()))){ // validate
            System.out.println("Diem hoa phai tu 0 den 10");
            System.exit(0);
        }
    }

    public static void xuat(SinhVien sv){
        System.out.println("Ho va ten: " + sv.getHoTen());
        System.out.println("Ma sinh vien: " + sv.getMaSinhVien());
        System.out.println("Diem trung binh: " + sv.diemTrungBinh());
        System.out.println("Xep loai: " + sv.xepLoai());
    }
}
