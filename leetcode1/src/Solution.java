import java.util.ArrayList;
import java.util.List;

class Solution {

    final List<String> l = new ArrayList<>(5);

    public int maxScore(String s) {

        //011101
        //012345

        int howManyOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                howManyOnes++;
            }
        }

        int result = 0;
        int howManyZeros = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                howManyOnes--;
            } else {
                howManyZeros++;
            }

            result = Math.max(result, howManyZeros+howManyOnes);
        }

        return result;

    }

    public void ceva() throws Exception{
        List<Integer> l = new ArrayList<>();
        l.get(1);
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "00";

        long start = System.currentTimeMillis();
        System.out.println(s.maxScore(str));
        long end = System.currentTimeMillis();

        //System.out.println(end - start);

//        s.l.add("dsfgs");
//        System.out.println(s.l);


    }
}