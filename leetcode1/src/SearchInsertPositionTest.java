import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void searchInsert() {

        int[] inputArray = new int[]{1,3,5,6};
        int inputTarget = 5;
        int expectedOutput = 2;
        int actualOutput = solution.searchInsert(inputArray, inputTarget);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInsert1() {

        int[] inputArray = new int[]{1,3,5,6};
        int inputTarget = 2;
        int expectedOutput = 1;
        int actualOutput = solution.searchInsert(inputArray, inputTarget);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInsert2() {

        int[] inputArray = new int[]{1,3,5,6};
        int inputTarget = 7;
        int expectedOutput = 4;
        int actualOutput = solution.searchInsert(inputArray, inputTarget);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInsert3() {

        int[] inputArray = new int[]{1,8,10,69,45,33};
        int inputTarget = 50;
        int expectedOutput = 5;
        int actualOutput = solution.searchInsert(inputArray, inputTarget);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInsert4() {

        int[] inputArray = new int[]{1,8,10,69,45,33};
        int inputTarget = 10;
        int expectedOutput = 2;
        int actualOutput = solution.searchInsert(inputArray, inputTarget);

        assertEquals(expectedOutput, actualOutput);
    }
}