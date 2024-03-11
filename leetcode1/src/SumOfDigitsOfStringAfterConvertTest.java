import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsOfStringAfterConvertTest {

    private SumOfDigitsOfStringAfterConvert solution = new SumOfDigitsOfStringAfterConvert();

    @Test
    void convertTest1() {
        String input = "zbax";
        BigInteger expectedResult = new BigInteger("262124");
        BigInteger actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest2() {
        String input = "leetcode";
        BigInteger expectedResult = new BigInteger("12552031545");
        BigInteger actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest3() {
        String input = "zbax";
        BigInteger expectedResult = new BigInteger("262124");
        BigInteger actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void convertTest4() {
        String input = "fleyctuuajsr";
        BigInteger expectedResult = new BigInteger("61252532021211101918");
        BigInteger actualResult = solution.convert(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest1() {
        String input = "262124";
        BigInteger expectedResult = new BigInteger("17");
        BigInteger actualResult = solution.transform(new BigInteger(input));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest2() {
        String input = "9999";
        BigInteger expectedResult = new BigInteger("36");
        BigInteger actualResult = solution.transform(new BigInteger(input));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void transformTest3() {
        String input = "12552031545";
        BigInteger expectedResult = new BigInteger("33");
        BigInteger actualResult = solution.transform(new BigInteger(input));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky() {
        String input = "zbax";
        int k = 2;
        int expectedResult = 8;
        int actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky2() {
        String input = "iiii";
        int k = 1;
        int expectedResult = 36;
        int actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky3() {
        String input = "leetcode";
        int k = 2;
        int expectedResult = 6;
        int actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLucky4() {
        String input = "fleyctuuajsr";
        int k = 5;
        int expectedResult = 8;
        int actualResult = solution.getLucky(input,k);
        assertEquals(expectedResult, actualResult);
    }
}