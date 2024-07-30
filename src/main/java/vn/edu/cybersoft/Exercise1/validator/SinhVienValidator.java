package vn.edu.cybersoft.Exercise1.validator;

public class SinhVienValidator {
    public static boolean validate(String hoTen, String maSinhVien, double diemToan, double diemLy, double diemHoa) {
        if (hoTen == null || hoTen.isEmpty()) {
            System.out.println("Ho ten khong duoc de trong");
            return false;
        }
        if (maSinhVien == null || maSinhVien.isEmpty()) {
            System.out.println("Ma sinh vien khong duoc de trong");
            return false;
        }
        if (diemToan < 0 || diemToan > 10) {
            System.out.println("Diem toan phai nam trong khoang tu 0 den 10");
            return false;
        }
        if (diemLy < 0 || diemLy > 10) {
            System.out.println("Diem ly phai nam trong khoang tu 0 den 10");
            return false;
        }
        if (diemHoa < 0 || diemHoa > 10) {
            System.out.println("Diem hoa phai nam trong khoang tu 0 den 10");
            return false;
        }
        return true;
    }
}
