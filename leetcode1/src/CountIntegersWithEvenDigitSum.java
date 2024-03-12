public class CountIntegersWithEvenDigitSum {

    public int countEven(int num) {
        if ( num == 1 ){
            return 0;
        }

        int result = 0;
        for (int i = 2; i <=  num; i++) {
            if (checkEvenDigitSum(i)){
                result ++;
            }
        }

        return result;
    }

    private boolean checkEvenDigitSum(int n) {
        int sum = 0;
        while ( n != 0){
           sum += n % 10;
           n = n / 10;
        }

        return sum % 2 == 0;
    }


}
