import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private ValidAnagram solution = new ValidAnagram();

    @Test
    void isAnagramNull() {

        String s2 = "";
        String s1 = "";
        boolean expectedOutput = true;
        boolean actualOutput = solution.isAnagram(s1, s2);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isAnagramOneNull() {

        String s2 = "ddd";
        String s1 = "";
        boolean expectedOutput = false;
        boolean actualOutput = solution.isAnagram(s1, s2);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isAnagram1() {

        String s2 = "anagram";
        String s1 = "nagaram";
        boolean expectedOutput = true;
        boolean actualOutput = solution.isAnagram(s1, s2);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isAnagram2() {

        String s2 = "rat";
        String s1 = "car";
        boolean expectedOutput = false;
        boolean actualOutput = solution.isAnagram(s1, s2);

        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isAnagram3() {

        String s2 = "zebra";
        String s1 = "rabzw";
        boolean expectedOutput = false;
        boolean actualOutput = solution.isAnagram(s1, s2);

        assertEquals(expectedOutput,actualOutput);
    }
}