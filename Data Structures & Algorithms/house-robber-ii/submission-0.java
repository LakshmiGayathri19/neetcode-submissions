class Solution {
    public int rob(int[] arr) {
        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];
        return Math.max(robRange(arr, 0, arr.length - 2), robRange(arr, 1, arr.length - 1));
    }

    private int robRange(int[] arr, int start, int end) {
        int firstPos = 0;
        int secondPos = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(firstPos + arr[i], secondPos);
            firstPos = secondPos;
            secondPos = temp;
        }
        return secondPos;
    }
}