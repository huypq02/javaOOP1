package vn.edu.cybersoft.Exercise2;

import vn.edu.cybersoft.Exercise1.SinhVien;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static vn.edu.cybersoft.Exercise1.OOPApplication.xuat;
import static vn.edu.cybersoft.Exercise1.validator.SinhVienValidator.numberValidator;
import static vn.edu.cybersoft.Exercise1.validator.SinhVienValidator.stringValidator;

public class OOPApplication {
    public static void main(String[] args) {
        try {
            // Create lists for student details
            List<String> hoTen = Arrays.asList("Nguyen Van A", "Tran Thi B");
            List<String> maSinhVien = Arrays.asList("SV001", "SV002");
            List<Double> diemToan = Arrays.asList(8.0, 7.5);
            List<Double> diemLy = Arrays.asList(7.0, 8.5);
            List<Double> diemHoa = Arrays.asList(9.0, 6.5);
            // init DSSinhVien object
            DSSinhVien list = new DSSinhVien(hoTen, maSinhVien, diemToan, diemLy, diemHoa);

            nhap(list);
            xuat(list);
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Du lieu nhap vao khong hop le");
            }
        }
    }

    public static void nhap(DSSinhVien list){
        Scanner sc = new Scanner(System.in);
        int mode = 1;
        List<String> hoTen = list.getHoTen();
        List<String> maSinhVien = list.getMaSinhVien();
        List<Double> diemToan = list.getDiemToan();
        List<Double> diemLy = list.getDiemLy();
        List<Double> diemHoa = list.getDiemHoa();

        while (true){
            // Nhap ho va ten
            System.out.println("Nhap ho va ten: ");
            hoTen.add(sc.nextLine());
            if (!stringValidator(hoTen.get(hoTen.size() - 1))){ // validate
                System.out.println("Ho va ten khong duoc de trong");
                System.exit(0);
            }
            // Ma sinh vien
            System.out.println("Nhap ma sinh vien: ");
            maSinhVien.add(sc.nextLine());
            if (!stringValidator(maSinhVien.get(maSinhVien.size() - 1))){ // validate
                System.out.println("Ma sinh vien khong duoc de trong");
                System.exit(0);
            }
            // Diem toan
            System.out.println("Nhap diem toan: ");
            diemToan.add(sc.nextDouble());
            if (!numberValidator((diemToan.get(diemToan.size() - 1)))){ // validate
                System.out.println("Diem toan phai tu 0 den 10");
                System.exit(0);
            }
            // Diem ly
            System.out.println("Nhap diem ly: ");
            list.getDiemLy().add(sc.nextDouble());
            if (!numberValidator((list.getDiemLy().get(list.getDiemLy().size() - 1)))){ // validate
                System.out.println("Diem ly phai tu 0 den 10");
                System.exit(0);
            }
            // Diem hoa
            System.out.println("Nhap diem hoa: ");
            list.getDiemHoa().add(sc.nextDouble());
            if (!numberValidator((list.getDiemHoa().get(list.getDiemHoa().size() - 1)))){ // validate
                System.out.println("Diem hoa phai tu 0 den 10");
                System.exit(0);
            }
            System.out.println("Tiep tuc nhap sinh vien? (1: Co, 0: Khong)");
            if (mode == 0){
                break;
            }
        }
    }

    public static void xuat(DSSinhVien list){
        for (int i = 0; i < list.getMaSinhVien().size(); i++){
            System.out.println("Ho va ten: " + list.getHoTen().get(i));
            System.out.println("Ma sinh vien: " + list.getMaSinhVien().get(i));
            System.out.println("Diem trung binh: " + list.diemTrungBinh().get(i));
            System.out.println("Xep loai: " + list.xepLoai(list.diemTrungBinh().get(i)));
        }
    }
}
