import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution = new Solution2();

    @Test
    public void removeElementTest1(){
        int[] inputArray = new int[]{3,2,2,3};
        int input = 3;
        int expectedOutput = 2;
        int actualOutput = solution.removeElement(inputArray ,input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeElementTest2(){
        int[] inputArray = new int[]{0,1,2,2,3,0,4,2};
        int input = 2;
        int expectedOutput = 5;
        int actualOutput = solution.removeElement(inputArray ,input);

        assertEquals(expectedOutput, actualOutput);
    }
}