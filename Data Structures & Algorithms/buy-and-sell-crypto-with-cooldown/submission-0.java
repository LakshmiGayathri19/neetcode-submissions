class Solution {
    Map<String, Integer> keyMapping = new HashMap<>();
	int dpSolution(int prices[], int position, boolean isBuying) {
		if(position >= prices.length) {
		return 0;
		}
		
		String key = position + "-" + isBuying;
		if(keyMapping.containsKey(key)) {
		return keyMapping.get(key);
		}

		int coolOff = dpSolution(prices, position+1, isBuying);
		if(isBuying) {
			int buy =  dpSolution(prices, position+1, false) - prices[position];
			keyMapping.put(key, Math.max(buy, coolOff));
		} else {
			int sell = dpSolution(prices, position+2, true) + prices[position];
			keyMapping.put(key, Math.max(sell, coolOff));
		}
        return  keyMapping.get(key);
		
	}

    public int maxProfit(int[] prices) {
        return dpSolution(prices, 0, true);
    }
}
