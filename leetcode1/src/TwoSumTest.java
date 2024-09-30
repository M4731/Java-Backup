import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum solution =  new TwoSum();

    @Test
    void twoSum() {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expectedOutput = new int[]{0,1};
        int[] actualOutput = solution.twoSum(nums,target);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void twoSum1() {

        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] expectedOutput = new int[]{1,2};
        int[] actualOutput = solution.twoSum(nums,target);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void twoSum2() {

        int[] nums = new int[]{3,3};
        int target = 6;
        int[] expectedOutput = new int[]{0,1};
        int[] actualOutput = solution.twoSum(nums,target);

        assertArrayEquals(expectedOutput, actualOutput);
    }
}