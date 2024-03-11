public class SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {

        long conv = convert(s);

        if (conv < 10){
            return (int) conv;
        }

        for (int i = 0; i < k; i++) {
            conv = transform(conv);
        }
        return (int) conv;
    }

    public long convert(String s){
        long result = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'i' ){
                result = result * 10 + (int) s.charAt(i) - 96;
            } else{
              result = result * 100 + (int) s.charAt(i) - 96;
            }
        }

        return result;
    }

    public long transform(long n){
        long result = 0;
        while( n > 0 ){
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        String test = "atest";
        for (int i = 0; i < test.length(); i++) {
            System.out.println( (int) test.charAt(i) );
        }
    }

}
