class Solution 
{
    public int minOperations(int[] nums) 
    {
        int ops = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (int num : nums) 
        {
            while (!stack.isEmpty() && stack.peek() > num) 
            {
                stack.pop();
            }
            
            if (stack.isEmpty() || stack.peek() < num) 
            {
                ops++;
                stack.push(num);
            }
            
        }

        return ops;
    }
}