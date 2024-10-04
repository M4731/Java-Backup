import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MEDTopKFrequentTest {

    MEDTopKFrequent solution = new MEDTopKFrequent();

    @Test
    void topKFrequent() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] expectedOutput = new int[]{1,2};
        int[] actualOutput = solution.topKFrequent(nums,k);

        assertArrayEquals(actualOutput,expectedOutput);
    }

    @Test
    void topKFrequent1() {
        int[] nums = new int[]{1};
        int k = 1;
        int[] expectedOutput = new int[]{1};
        int[] actualOutput = solution.topKFrequent(nums,k);

        assertArrayEquals(actualOutput,expectedOutput);
    }
}