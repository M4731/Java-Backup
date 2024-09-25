import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddToArrayFormOfIntegerTest {

    private AddToArrayFormOfInteger Solution = new AddToArrayFormOfInteger();

    @Test
    void addToArrayForm() {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,4));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

    @Test
    void addToArrayForm1() {
        int[] num = {2,7,4};
        int k = 181;
        List<Integer> result = new ArrayList<>(Arrays.asList(4,5,5));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

    @Test
    void addToArrayForm2() {
        int[] num = {2,1,5};
        int k = 806;
        List<Integer> result = new ArrayList<>(Arrays.asList(1,0,2,1));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

    @Test
    void addToArrayForm3() {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> result = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

    @Test
    void addToArrayFormNull() {
        int[] num = {};
        int k = 0;
        List<Integer> result = new ArrayList<>(Arrays.asList(0));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

    @Test
    void addToArrayFormNull1() {
        int[] num = {1,2,6};
        int k = 0;
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,6));

        assertEquals(result, Solution.addToArrayForm(num,k));
    }

}