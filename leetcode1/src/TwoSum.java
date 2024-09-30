import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> difference = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (difference.containsKey(target-nums[i])){
                return new int[]{difference.get(target-nums[i]),i};
            }
            else {
                difference.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}
