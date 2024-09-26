import java.util.Collections;

public class AddStrings {

    public String addStrings(String num1, String num2) {

        if (num1.isEmpty()) return num2;
        if (num2.isEmpty()) return num1;

        StringBuilder result = new StringBuilder();

        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum = 0;
        int carry = 0;

        while ( i >= 0 || j >= 0 || carry == 1 ){
            sum = 0;

            if ( i >= 0 ){
                sum += num1.charAt(i) - 48;
            }
            if ( j >= 0 ){
                sum += num2.charAt(j) - 48;
            }
            sum += carry;

            if ( sum >= 10 ) carry = 1;
            else carry = 0;

            i--;
            j--;
            result.append(sum%10);
        }

        result.reverse();
        return result.toString();

    }

}
