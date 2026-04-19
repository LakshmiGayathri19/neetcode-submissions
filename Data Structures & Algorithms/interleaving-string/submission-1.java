class Solution {
    Map<String, Boolean> hm = new HashMap<>();
    public boolean dp(String s1, String s2, String s3, int i, int j, int k) {
        if (k == s3.length()) {
            return (i == s1.length() && j == s2.length());
        }
        String key = i + "-"+ j;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }

        boolean res = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
            res = dp(s1, s2, s3, i + 1, j, k+1);
        }
        if(!res && j<s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
            res = dp(s1,s2,s3,i,j+1,k+1);
		}
		hm.put(key, res);
		return res;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        return dp(s1,s2,s3, 0,0,0);
    }
}
