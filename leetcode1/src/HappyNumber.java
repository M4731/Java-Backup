import java.util.LinkedList;
import java.util.List;

public class HappyNumber {

    public boolean isHappy(int n) {
        List<Integer> loop = new LinkedList<>();

        while ( n != 0 ){

            if ( loop.contains(n) ){
                return false;
            } else if ( n != 1){
                loop.add(n);
            } else {
                return true;
            }

            int temp = 0;
            while ( n > 0 ){
                temp += Math.pow( n % 10, 2);
                n = n/10;
            }
            n = temp;
        }

        return false;
    }

}
