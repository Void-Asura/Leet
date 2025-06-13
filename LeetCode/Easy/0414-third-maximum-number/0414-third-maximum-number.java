class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Set<Integer> seen = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) 
        {
            if (seen.contains(num))
             continue;
             seen.add(num);
             pq.offer(num);

            if (pq.size() > 3) 
            {
                pq.poll();
            }
        }

        if (pq.size() < 3) {
            int max = Integer.MIN_VALUE;
            for (int val : pq) {
                max = Math.max(max, val);
            }
            return max;
        }

        return pq.peek();

    }
}