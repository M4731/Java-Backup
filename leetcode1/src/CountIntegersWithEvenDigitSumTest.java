import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountIntegersWithEvenDigitSumTest {

    private CountIntegersWithEvenDigitSum solution = new CountIntegersWithEvenDigitSum();

    @Test
    void countEven() {
        int input = 4;
        int expectedOutput = 2;
        int actualOutput = solution.countEven(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void countEven1() {
        int input = 30;
        int expectedOutput = 14;
        int actualOutput = solution.countEven(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void countEven2() {
        int input = 1;
        int expectedOutput = 0;
        int actualOutput = solution.countEven(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void countEven3() {
        int input = 2;
        int expectedOutput = 1;
        int actualOutput = solution.countEven(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void countEven4() {
        int input = 11;
        int expectedOutput = 5;
        int actualOutput = solution.countEven(input);
        assertEquals(expectedOutput, actualOutput);
    }

}