import java.util.*;

class Solution {


    public int solution(int[][] boxes) {

        Comparator comparatorX = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((int[]) o2)[0] - ((int[]) o1)[0];
            }
        };

        Comparator comparatorY = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((int[]) o2)[1] - ((int[]) o1)[1];
            }
        };

        Comparator comparatorZ = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((int[]) o2)[2] - ((int[]) o1)[2];
            }
        };

        Arrays.sort(boxes, comparatorX);
        Arrays.sort(boxes, comparatorY);
        Arrays.sort(boxes, comparatorZ);

        List<int[]> widestZ = new ArrayList<>();
        List<int[]> widestY = new ArrayList<>();
        List<int[]> widestX = new ArrayList<>();

        for (int[]x : boxes){

        }
    }
}