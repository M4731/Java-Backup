import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void lengthOfLastWord() {

        String input = "Hello World";
        int expectedOutput = 5;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord1() {

        String input = "   fly me   to   the moon  ";
        int expectedOutput = 4;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord2() {

        String input = "luffy is still joyboy";
        int expectedOutput = 6;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord3() {

        String input = "World";
        int expectedOutput = 5;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord4() {

        String input = "";
        int expectedOutput = 0;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord5() {

        String input = "     Nu     stiu      ";
        int expectedOutput = 4;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void lengthOfLastWord6() {

        String input = "a ";
        int expectedOutput = 1;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }


    @Test
    void lengthOfLastWord7() {

        String input = "dssa    ";
        int expectedOutput = 4;
        int actualOutput = solution.lengthOfLastWord(input);
        assertEquals(expectedOutput, actualOutput);

    }
}