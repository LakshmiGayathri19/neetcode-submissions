class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int stone : stones) {
            pq.add(stone);
        }
        while (!pq.isEmpty()) {
            if (pq.size() == 1) {
                return pq.poll();
            }
            int x = pq.poll(), y = pq.poll();
            if (x < y || y < x) {
                pq.add(Math.abs(x - y));
            }
        }
        return 0;
    }
}
