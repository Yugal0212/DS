import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Lab7_43 {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(9, 10));

        List<Interval> mergedIntervals = merge(intervals);

        System.out.println("Output: " + Arrays.toString(mergedIntervals.toArray()));
    }

    private static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> result = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);
            if (current.end >= next.start) {
                // Overlapping intervals, merge them
                current.end = Math.max(current.end, next.end);
            } else {
                // Non-overlapping interval, add current to result
                result.add(current);
                current = next;
            }
        }

        // Add the last interval
        result.add(current);
        return result;
    }
}
