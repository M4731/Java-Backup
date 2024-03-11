import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsOfStringAfterConvertTest {

    private SumOfDigitsOfStringAfterConvert solution = new SumOfDigitsOfStringAfterConvert();

    @Test
    void convertTest1() {
        String input = "zbax";
        long expectedResult = 262124;
        long actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest2() {
        String input = "leetcode";
        long expectedResult = 12552031545L;
        long actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest3() {
        String input = "zbax";
        long expectedResult = 262124;
        long actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest4() {
        String input = "fleyctuuajsr";
        BigInteger expectedResult = new BigInteger(61252532021211101918);
        long actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest1() {
        long input = 262124;
        long expectedResult = 17;
        long actualResult = solution.transform(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest2() {
        long input = 9999;
        long expectedResult = 36;
        long actualResult = solution.transform(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest3() {
        long input = 12552031545L;
        long expectedResult = 33;
        long actualResult = solution.transform(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky() {
        String input = "zbax";
        int k = 2;
        long expectedResult = 8;
        long actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky2() {
        String input = "iiii";
        int k = 1;
        long expectedResult = 36;
        long actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky3() {
        String input = "leetcode";
        int k = 2;
        long expectedResult = 6;
        long actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky4() {
        String input = "fleyctuuajsr";
        int k = 5;
        long expectedResult = 8;
        long actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }
}