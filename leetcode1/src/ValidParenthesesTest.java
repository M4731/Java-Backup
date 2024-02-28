import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    public void isValidTest1(){
        String input = "()";
        boolean expectedValue = true;
        boolean actualValue = solution.isValid(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isValidTest2(){
        String input = "()[]{}";
        boolean expectedValue = true;
        boolean actualValue = solution.isValid(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isValidTest3(){
        String input = "(]";
        boolean expectedValue = false;
        boolean actualValue = solution.isValid(input);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isValidTest4(){
        String input = "([)]";
        boolean expectedValue = false;
        boolean actualValue = solution.isValid(input);
        assertEquals(expectedValue, actualValue);
    }

}