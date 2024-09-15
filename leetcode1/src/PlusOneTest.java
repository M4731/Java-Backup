import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private PlusOne solution = new PlusOne();

    @Test
    void plusOne() {

        int[] digits = new int[]{1,2,3};
        int[] expectedOutput = new int[]{1,2,4};
        int[] actualOutput = solution.plusOne(digits);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void plusOneNull() {

        int[] digits = new int[]{};
        int[] expectedOutput = new int[]{};
        int[] actualOutput = solution.plusOne(digits);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void plusOne2() {

        int[] digits = new int[]{9};
        int[] expectedOutput = new int[]{1,0};
        int[] actualOutput = solution.plusOne(digits);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void plusOne3() {

        int[] digits = new int[]{4,3,2,1};
        int[] expectedOutput = new int[]{4,3,2,2};
        int[] actualOutput = solution.plusOne(digits);

        assertArrayEquals(expectedOutput, actualOutput);
    }
}