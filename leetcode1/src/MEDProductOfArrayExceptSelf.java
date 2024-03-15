public class MEDProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        //produsul total si impart
        int zeros = 0;

        int produs = 1;
        for(int i:nums){
            if(i != 0){
                produs = produs * i;
            } else {
                zeros++;
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(zeros > 1){
              result[i] = 0;
            } else if(nums[i] == 0){
                result[i] = produs;
            } else if(zeros == 1){
                result[i] = 0;
            } else {
                result[i] = produs / nums[i];
            }
        }

        return result;
    }

}
