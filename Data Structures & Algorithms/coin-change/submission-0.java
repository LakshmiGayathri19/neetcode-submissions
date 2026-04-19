class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        dp[0]=0;
		for(int i=1; i<amount+1; i++) {
			dp[i] = Integer.MAX_VALUE-1;
		}
		for(int i= 0; i< coins.length; i++) {
			int coin = coins[i];
			for(int j=1; j<=amount; j++) {
				if(coin<=j) {
                    dp[j] = Math.min(dp[j-coin] + 1, dp[j]);
                    // System.out.println("coin = " + coin + " amount = " + j + " dp[j] = " + dp[j]);
				}
			}
		}
        // for(int i=0; i<amount+1; i++) {
		// 	System.out.print(dp[i] + " ");
		// }
        return (dp[amount] != Integer.MAX_VALUE-1) ? dp[amount] : -1;
    }
}
