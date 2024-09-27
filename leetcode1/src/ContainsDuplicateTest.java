import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void containsDuplicate() {

        int[] nums = {1,2,3,1};
        boolean expectedOutput = true;
        boolean actualOutput = solution.containsDuplicate(nums);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void containsDuplicate1() {

        int[] nums = {1,2,3,4};
        boolean expectedOutput = false;
        boolean actualOutput = solution.containsDuplicate(nums);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void containsDuplicate2() {

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean expectedOutput = true;
        boolean actualOutput = solution.containsDuplicate(nums);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void containsDuplicateNull() {

        int[] nums = {};
        boolean expectedOutput = false;
        boolean actualOutput = solution.containsDuplicate(nums);

        assertEquals(expectedOutput,actualOutput);
    }
}