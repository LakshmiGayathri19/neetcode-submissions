class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int maxEnd = 0;
        for (int i = 0; i < intervals.length; i++) {
            maxEnd = Math.max(maxEnd, intervals[i][1]);
        }
        int scale[] = new int[maxEnd + 1];
        for (int i = 0; i < scale.length; i++){
            scale[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0], end = intervals[i][1];
            int length = end - start + 1;
            while (start <= end) {
                scale[start] = Math.min(scale[start], length);
                start++;
            }
        }
        // for (int i = 0; i < scale.length; i++){
        //     System.out.print(scale[i] + " ");
        //     System.out.println();
        // }
        int result[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > maxEnd || scale[queries[i]] == Integer.MAX_VALUE) {
                result[i] = -1;
            } else {
                result[i] = scale[queries[i]];
            }
        }
        return result;
    }
}
