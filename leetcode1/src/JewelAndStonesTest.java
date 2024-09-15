import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelAndStonesTest {

    private JewelAndStones solution = new JewelAndStones();

    @Test
    void numJewelsInStones() {

        String jewels = "aA";
        String stones = "aAAbbbb";
        int expectedOutput = 3;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones1() {

        String jewels = "";
        String stones = "aAAbbbb";
        int expectedOutput = 0;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones2() {

        String jewels = "aA";
        String stones = "";
        int expectedOutput = 0;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones3() {

        String jewels = "";
        String stones = "";
        int expectedOutput = 0;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones4() {

        String jewels = "";
        String stones = "";
        int expectedOutput = 0;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones5() {

        String jewels = "z";
        String stones = "ZZ";
        int expectedOutput = 0;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void numJewelsInStones6() {

        String jewels = "abcR";
        String stones = "REEEEABCawwqwR";
        int expectedOutput = 3;
        int actualOutput = solution.numJewelsInStones(jewels,stones);

        assertEquals(expectedOutput, actualOutput);
    }
}