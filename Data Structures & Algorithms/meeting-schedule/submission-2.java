/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return true;
        }
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        
        Interval first = intervals.get(0);
        int prevStart = first.start, prevEnd = first.end;
        for (int i=1; i<intervals.size(); i++) {
            if (intervals.get(i).start < prevEnd) {
                return false;
            }
            prevStart = intervals.get(i).start;
            prevEnd = intervals.get(i).end;
        }

        return true;
    }
}
