class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos = 0;
        for(int i=0; i<t.length(); i++) {
            if(pos == s.length()) {
                break;
            } else {
                if(s.charAt(pos) == t.charAt(i)) {
                    pos++;
                }
            }
        }
        if(pos == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}