package vn.edu.cybersoft.Exercise2;

import java.util.List;

public class DSSinhVien {
    private List<String> hoTen;
    private List<String> maSinhVien;
    private List<Double> diemToan;
    private List<Double> diemLy;
    private List<Double> diemHoa;
    private List<Double> diemTB;

    public DSSinhVien() {
    }

    public DSSinhVien(List<String> hoTen, List<String> maSinhVien, List<Double>  diemToan, List<Double>  dieLy, List<Double>  diemHoa) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.diemToan = diemToan;
        this.diemLy = dieLy;
        this.diemHoa = diemHoa;
    }


    public List<Double> diemTrungBinh () {
        for (int i = 0; i < maSinhVien.size(); i++){
            this.diemTB.add(((this.diemToan.get(i) + this.diemLy.get(i) + this.diemHoa.get(i)) / 3));
        }
        return this.diemTB;
    }

    public String xepLoai(double diemTrungBinh) {
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

    public double maxNumber(List<Double> numArr){
        double max = numArr.get(0);
        for (int i = 1; i < numArr.size(); i++){
            if (numArr.get(i) > max){
                max = numArr.get(i);
            }
        }
        return max;
    }

    public double isExistWeakStudent(List<Double> numArr){
        for (int i = 0; i < numArr.size(); i++){
            if (numArr.get(i) < 5){
                return numArr.get(i);
            }
        }
        return -1;
    }

    public String findName(List<String> nameArr, String name){
        for (int i = 0; i < nameArr.size(); i++){
            if (nameArr.get(i) == name){
                return nameArr.get(i);
            }
        }
        return "";
    }

    public String findId(List<String> idArr, String id){
        for (int i = 0; i < idArr.size(); i++){
            if (idArr.get(i) == id){
                return idArr.remove(i);
            }
        }
        return "";
    }

    public boolean removeStudentById(List<String> idArr, String id){
        for (int i = 0; i < idArr.size(); i++){
            if (idArr.get(i) == id){
                idArr.remove(i);
                return true;
            }
        }
        return false;
    }


    public List<String> getHoTen() {
        return hoTen;
    }

    public void setHoTen(List<String> hoTen) {
        this.hoTen = hoTen;
    }

    public List<String> getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(List<String> maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public List<Double> getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(List<Double> diemToan) {
        this.diemToan = diemToan;
    }

    public List<Double> getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(List<Double> diemLy) {
        this.diemLy = diemLy;
    }

    public List<Double> getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(List<Double> diemHoa) {
        this.diemHoa = diemHoa;
    }

    public List<Double> getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(List<Double> diemTB) {
        this.diemTB = diemTB;
    }
}
