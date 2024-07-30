package vn.edu.cybersoft.Exercise1.validator;

public class SinhVienValidator {
    public static boolean stringValidator(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean numberValidator(double point){
        if (point < 0 || point > 10) {
            return false;
        }
        return true;
    }
}
