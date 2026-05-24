class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = carry + digits[i] ;
            carry = res / 10;
            result.add(0, res % 10);
            // System.out.println(result);
        }
        if(carry!=0) {
            result.add(0, carry);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
