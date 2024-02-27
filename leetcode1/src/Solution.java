import java.util.ArrayList;
import java.util.LinkedList;
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

    public int removeDuplicates(int[] nums) {

        if(nums.length == 1){
            return 1;
        }

        List<Integer> list = new LinkedList<>();
        int counter = 1;
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                counter++;
                list.add(nums[i]);
            }
        }

//        nums = list.stream()
//                   .mapToInt(i->i)
//                   .toArray();

        for (int i = 0; i < list.size(); i++){
            nums[i]=list.get(i);
        }

        for (int i:nums){
            System.out.println(i);
        }
        return counter;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

//        String str = "00";
//
//        long start = System.currentTimeMillis();
//        System.out.println(s.maxScore(str));
//        long end = System.currentTimeMillis();

        //System.out.println(end - start);

        int[] test1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] test2 = new int[]{1,1,2};
        int[] test3 = new int[]{1,2};
        System.out.println(s.removeDuplicates(test3));

//        s.l.add("dsfgs");
//        System.out.println(s.l);


    }
}