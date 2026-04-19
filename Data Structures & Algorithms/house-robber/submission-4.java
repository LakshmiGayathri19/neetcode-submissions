class Solution {
    public int findProfit(int position, int arr[], int dp[]) {
		if(position>=arr.length){
			return 0;
		} else if (dp[position] != -1) {
            return dp[position];
        }
		else {
			int consider = arr[position] + findProfit(position+2, arr, dp);
			int notConsider = findProfit(position+1, arr, dp);
            dp[position] = Math.max(consider, notConsider);
			return dp[position];
		}
	}

    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return findProfit(0, nums, dp);
    }
}
