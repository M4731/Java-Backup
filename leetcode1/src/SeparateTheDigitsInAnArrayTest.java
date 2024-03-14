import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparateTheDigitsInAnArrayTest {

    private SeparateTheDigitsInAnArray solution = new SeparateTheDigitsInAnArray();

    @Test
    void separateDigits() {
        int input[] = new int[]{13,25,83,77};
        int expectedOutput[] = new int[]{1,3,2,5,8,3,7,7};
        int actualOutput[] = solution.separateDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void separateDigits1() {
        int input[] = new int[]{7,1,3,9};
        int expectedOutput[] = new int[]{7,1,3,9};
        int actualOutput[] = solution.separateDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }
}