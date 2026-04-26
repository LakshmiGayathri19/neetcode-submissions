class Solution {
    public boolean canJump(int[] nums) {
       boolean dp[] = new boolean[nums.length];
       dp[nums.length-1] = true;
      for(int pos=nums.length-2; pos>=0; pos--) {
        int len = nums[pos];
        boolean possible = false;
        while(len>=0) {
            if(pos+len<nums.length && dp[pos+len]) {
                possible = true;
                break;
            } 
            len--;
        }
        dp[pos] = possible;
        // System.out.println("pos = " + pos + " possible = " + possible);
      }
      return dp[0];
    }
}
