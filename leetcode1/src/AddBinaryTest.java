import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    private AddBinary solution = new AddBinary();

    @Test
    void addBinary() {

        String a = "11";
        String b = "1";
        String expectedResult = "100";
        String actualResult = solution.addBinary(a,b);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void addBinary1() {

        String a = "1010";
        String b = "1011";
        String expectedResult = "10101";
        String actualResult = solution.addBinary(a,b);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void addBinary2() {

        String a = "";
        String b = "1";
        String expectedResult = "1";
        String actualResult = solution.addBinary(a,b);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void addBinary3() {

        String a = "";
        String b = "";
        String expectedResult = "";
        String actualResult = solution.addBinary(a,b);

        assertEquals(expectedResult,actualResult);
    }
}