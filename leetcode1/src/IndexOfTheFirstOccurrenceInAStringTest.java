import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfTheFirstOccurrenceInAStringTest {

    private static IndexOfTheFirstOccurrenceInAString solution = new IndexOfTheFirstOccurrenceInAString();

    @Test
    void strStrTest1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Integer expectedOutput = 0;
        assertEquals(expectedOutput, solution.strStr(haystack, needle));
    }

    @Test
    void strStrTest2() {
        String haystack = "leetcode";
        String needle = "leeto";
        Integer expectedOutput = -1;
        assertEquals(expectedOutput, solution.strStr(haystack, needle));
    }

    @Test
    void strStrTest3() {
        String haystack = "sadbutsad";
        String needle = "sasad";
        Integer expectedOutput = -1;
        assertEquals(expectedOutput, solution.strStr(haystack, needle));
    }
}