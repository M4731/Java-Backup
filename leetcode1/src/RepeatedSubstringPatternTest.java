import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {

    RepeatedSubstringPattern solution = new RepeatedSubstringPattern();

    @Test
    void solutionTest() {
        String input = "abab";
        boolean expectedOutput = true;
        boolean actualOutput = solution.solution(input);
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void solutionTest1() {
        String input = "abcabcabcabc";
        boolean expectedOutput = true;
        boolean actualOutput = solution.solution(input);
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void solutionTest2() {
        String input = "aba";
        boolean expectedOutput = false;
        boolean actualOutput = solution.solution(input);
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void solutionTest3() {
        String input = "a";
        boolean expectedOutput = false;
        boolean actualOutput = solution.solution(input);
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void solutionTest4() {
        String input = "aaaa";
        boolean expectedOutput = true;
        boolean actualOutput = solution.solution(input);
        assertEquals(actualOutput, expectedOutput);
    }
}