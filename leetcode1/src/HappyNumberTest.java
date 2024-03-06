import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    HappyNumber solution = new HappyNumber();

    @Test
    void isHappy1() {
        int input = 19;
        boolean expectedOutput = true;
        boolean actualOutput = solution.isHappy(input);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isHappy2() {
        int input = 3;
        boolean expectedOutput = false;
        boolean actualOutput = solution.isHappy(input);
        assertEquals(expectedOutput,actualOutput);
    }
}