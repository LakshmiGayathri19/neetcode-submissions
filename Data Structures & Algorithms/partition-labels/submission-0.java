class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), i);
        }
        List<Integer> result = new ArrayList<>();
        int right = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(hm.get(s.charAt(i)), right);
            if (i == right) {
                result.add(right - left + 1);
                left = i + 1;
            }
        }
        return result;
    }
}
