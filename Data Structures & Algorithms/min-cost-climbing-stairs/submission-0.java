class Solution {
    public int minCostClimbingStairs(int[] arr) {
        
         int dp[] = new int[arr.length+1];
   dp[0] = 0;
  dp[1] =0;
       for(int i=2; i<arr.length+1; i++) {
           dp[i] = Math.min(dp[i-1]+arr[i-1], dp[i-2]+arr[i-2]);
        }
       return dp[arr.length];

    }
}
