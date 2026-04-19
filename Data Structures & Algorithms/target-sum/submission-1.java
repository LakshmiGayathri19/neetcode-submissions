class Solution {
    HashMap<String, Integer> hm = new HashMap<>();
    public int dp(int nums[], int position, int sum, int target) {
        if (position == nums.length) {
            return (sum == target) ? 1 : 0;
        }
        String key = position + "-" + sum;
        
        // add case
        int addResult = dp(nums, position + 1, sum + nums[position], target);
        // sub case
        int subResult = dp(nums, position + 1, sum - nums[position], target);
        hm.put(key, addResult+subResult);

        return addResult+subResult;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return dp(nums, 0, 0, target);
    }
}
