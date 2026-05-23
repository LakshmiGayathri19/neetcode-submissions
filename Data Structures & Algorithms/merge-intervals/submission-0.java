class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int firstStart = result.get(result.size() - 1)[0];
            int firstEnd = result.get(result.size() - 1)[1];
            // System.out.println(firstStart + " " + firstEnd);
            if (intervals[i][0] <= firstEnd) {
                if (intervals[i][1] <= firstEnd) {
                    continue;
                } else {
                    result.get(result.size() - 1)[1] = intervals[i][1];
                }
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[0][]);
    }
}
