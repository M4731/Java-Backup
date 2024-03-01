import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private static LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] input = {"flower","flow","flight"};
        String expectedOutput = "fl";
        String actualOutput = solution.longestCommonPrefix(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void longestCommonPrefix1() {
        String[] input = {"dog","racecar","car"};
        String expectedOutput = "";
        String actualOutput = solution.longestCommonPrefix(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void longestCommonPrefix2() {
        String[] input = {"salt","sssss","sswa","silviu"};
        String expectedOutput = "s";
        String actualOutput = solution.longestCommonPrefix(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void longestCommonPrefix3() {
        String[] input = {"ab","a"};
        String expectedOutput = "a";
        String actualOutput = solution.longestCommonPrefix(input);
        assertEquals(expectedOutput, actualOutput);
    }
}