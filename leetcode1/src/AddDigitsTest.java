import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    AddDigits solution = new AddDigits();

    @Test
    void addDigits() {
        int input = 38;
        int expectedOutput = 2;
        int actualOutput = solution.addDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addDigits2() {
        int input = 3;
        int expectedOutput = 3;
        int actualOutput = solution.addDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addDigits3() {
        int input = 0;
        int expectedOutput = 0;
        int actualOutput = solution.addDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addDigits5() {
        int input = 1114;
        int expectedOutput = 7;
        int actualOutput = solution.addDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }
}