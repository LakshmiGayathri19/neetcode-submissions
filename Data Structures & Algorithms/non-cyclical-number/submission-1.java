class Solution {
    public boolean isHappy(int n) {
        int seen[] = new int[1000+1];
		String number = String.valueOf(n);
		while(seen[Integer.valueOf(number)]!=1) {
			seen[Integer.valueOf(number)] = 1;
            int result = 0;
			for(Character ch: number.toCharArray()) {
				result += Math.pow(Integer.valueOf(String.valueOf(ch)),2);
			}
            number = String.valueOf(result);
            // System.out.println("number = " + number);
			if(result == 1) return true;
		}
		return false;

    }
}
