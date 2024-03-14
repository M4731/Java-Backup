import java.util.*;

public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums) {
            res.addAll(listFunction(i));
        }

        int[] arr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }

    private List<Integer> listFunction(int i) {

        List<Integer> ret = new ArrayList<>();
        while(i > 0){
            ret.add(i % 10);
            i = i / 10;
        }

        Collections.reverse(ret);
        return ret;
    }

}
