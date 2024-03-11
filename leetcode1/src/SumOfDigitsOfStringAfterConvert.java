import java.math.BigInteger;

public class SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {

        BigInteger conv = convert(s);

        if (conv.compareTo(new BigInteger("10")) < 0){
            return (int) conv.longValue();
        }

        for (int i = 0; i < k; i++) {
            conv = transform(conv);
        }
        return (int) conv.longValue();
    }

    public BigInteger convert(String s){
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'i' ){
                //result = result * 10 + (int) s.charAt(i) - 96;
                result = result.multiply(new BigInteger("10")).add(new BigInteger(String.valueOf(s.charAt(i) - 96)));
            } else{
                //result = result * 100 + (int) s.charAt(i) - 96;
                result = result.multiply(new BigInteger("100")).add(new BigInteger(String.valueOf(s.charAt(i) - 96)));
            }
        }

        return result;
    }

    public BigInteger transform(BigInteger n){
        BigInteger result = new BigInteger("0");
        while( n.compareTo(new BigInteger("0")) > 0 ){
            //result += n % 10;
            result =  result.add(n.mod(new BigInteger("10")));
            n = n.divide(new BigInteger("10"));
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
