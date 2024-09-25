import java.util.*;

public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        if (num.length == 0) return new ArrayList<>(List.of(k));

        List<Integer> y = new ArrayList<>();

        while (k > 0){
            y.add(k % 10);
            k /= 10;
        }

        Collections.reverse(y);
        int i, j, carry, sum;
        i = num.length - 1;
        j = y.size() - 1;
        carry = 0;

        List<Integer> result = new ArrayList<>();

        while ( i >= 0 || j >= 0 || carry != 0 ){

            sum = 0;
            if ( i >= 0 ) sum += num[i];
            if ( j >= 0 ) sum += y.get(j);
            sum += carry;

            if ( sum >= 10 ) {
                carry = 1;
            }
            else {
                carry = 0;
            }

            result.add(sum % 10);
            i--; j--;
        }

        Collections.reverse(result);
        return result;
    }

}
