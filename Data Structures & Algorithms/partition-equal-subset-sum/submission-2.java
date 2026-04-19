class Solution {
    public boolean findIfTargetSumPossible(int nums[], int position, int sum, int target) {
        if(sum == target) {
            return true;
        }

        if(position+1<nums.length) {
        return findIfTargetSumPossible(nums, position+1, sum+nums[position], target) ||
                findIfTargetSumPossible(nums, position+1, sum, target);
        }
        return false;
    }
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        // Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        if(totalSum%2!=0) {
            return false;
        }
        int targetSum = totalSum / 2;
        System.out.println("targetSum = " + targetSum);
        int count = 0;
        return findIfTargetSumPossible(nums,0,0, targetSum);
    }
}
