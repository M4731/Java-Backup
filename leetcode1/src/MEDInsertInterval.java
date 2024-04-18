import java.util.ArrayList;
import java.util.List;

public class MEDInsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List sol = new ArrayList<int[]>();
        int first;

        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] < newInterval[0]){
                sol.add(intervals[i]);
                first = intervals[i][0];
            }
        }

        sol.remove()


    }

}
