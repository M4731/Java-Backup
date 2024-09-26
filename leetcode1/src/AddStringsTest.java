import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest {

    private AddStrings solution = new AddStrings();

    @Test
    void addStrings() {
        String num1 = "11";
        String num2 = "123";
        String expectedOutput =  "134";

        assertEquals(expectedOutput, solution.addStrings(num1,num2));
    }

    @Test
    void addStrings1() {
        String num1 = "456";
        String num2 = "77";
        String expectedOutput =  "533";

        assertEquals(expectedOutput, solution.addStrings(num1,num2));
    }

    @Test
    void addStrings2() {
        String num1 = "";
        String num2 = "123";
        String expectedOutput =  "123";

        assertEquals(expectedOutput, solution.addStrings(num1,num2));
    }

    @Test
    void addStrings3() {
        String num1 = "11";
        String num2 = "";
        String expectedOutput =  "11";

        assertEquals(expectedOutput, solution.addStrings(num1,num2));
    }

    @Test
    void addStrings4() {
        String num1 = "";
        String num2 = "";
        String expectedOutput =  "";

        assertEquals(expectedOutput, solution.addStrings(num1,num2));
    }
}