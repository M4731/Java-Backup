import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MEDTopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {

        //we make a map to get the frequency of every number
        Map<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        //we make an array in which, on every index, we have a list representing the frequency of that number
        //we do this to have the map sorted
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freq.keySet()){
            int value = freq.get(key);
            if (bucket[value] == null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }

        //we take the k numbers with the highest frequency, put them in the array result and return it
        int[] result = new int[k];
        int count = 0;
        for (int i = bucket.length-1; i > 0; i--) {
            if (bucket[i] != null){
                for (int j = 0; j < bucket[i].size() && count < k; j++) {
                    result[count] = bucket[i].get(j);
                    count ++;
                }
            }
        }

        return result;
    }

}
