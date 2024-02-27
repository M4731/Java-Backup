import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void maxScoreTest(){
        String input = "00111";
        int expectedOutput = 5;
        int actualOutput = solution.maxScore(input);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void maxScoreTest1(){
        String input = "011101";
        int expectedOutput = 5;
        int actualOutput = solution.maxScore(input);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void maxScoreTest2(){
        String input = "1111";
        int expectedOutput = 3;
        int actualOutput = solution.maxScore(input);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void maxScoreTest3(){
        String input = "00";
        int expectedOutput = 1;
        int actualOutput = solution.maxScore(input);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void maxScoreTest4(){
        String input = "0100";
        int expectedOutput = 2;
        int actualOutput = solution.maxScore(input);

        assertEquals(expectedOutput, actualOutput);

    }

}