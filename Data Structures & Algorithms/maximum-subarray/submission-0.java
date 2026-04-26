class Solution {
    public int maxSubArray(int[] nums) {
        int index=0;
        int count = 0, max = Integer.MIN_VALUE;
        while(index<nums.length) {
            // System.out.println("max = " + max + " index = " + index);
            count += nums[index];
            max = Math.max(count, max);
            if(count<0) {
                count=0;
            }
            index++;
        }
        return max;
    }
}
