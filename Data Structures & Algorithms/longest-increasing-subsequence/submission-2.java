class Solution {
    public int lengthOfLIS(int[] arr) {
        int dp[] = new int[arr.length];
		int res = 1;
		for(int i=0; i<arr.length; i++){
            dp[i]  = 1;
        }
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j< i; j++) {
				if(arr[j] < arr[i]) {
				dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		res = Math.max(res, dp[i]);
		}
		return res;
    }
}
