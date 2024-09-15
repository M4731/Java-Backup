import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        if (digits.length == 0)
            return digits;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
//        for (int i = 1; i < result.length; i++) {
//            result[i] = 0;
//        }

        return result;
    }
}
