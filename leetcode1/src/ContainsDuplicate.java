import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if (nums.length == 0) return false;
        Map<Integer,Boolean> occurrence = new HashMap<Integer,Boolean>();

        for (int x : nums) {
            if(occurrence.containsKey(x)) return true;
            occurrence.put(x,true);
        }

        return false;
    }

}
