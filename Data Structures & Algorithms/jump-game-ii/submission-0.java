class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0]=0;
        for(int i=1; i<nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<nums.length; i++) {
            int j=i+1;
            while(j<nums.length && j<=i+nums[i]) {
                dp[j] = Math.min(dp[j], dp[i]+1);
                j++;
            }
        }
        return dp[nums.length-1];
    }
}
