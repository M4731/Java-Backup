public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                return i;
            }

            if (target > nums[i]){
                index++;
            }
        }
        return index;
    }

}
