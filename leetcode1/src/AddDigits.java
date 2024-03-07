public class AddDigits {

    public int addDigits(int num) {

        while ( num > 9 ){
            int helper = 0;
            while ( num > 0 ){
                helper += num%10;
                num /= 10;
            }
            num = helper;
        }

        return num;

    }

}
