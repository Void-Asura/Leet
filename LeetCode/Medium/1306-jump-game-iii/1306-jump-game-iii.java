class Solution 
{
    public boolean canReach(int[] arr, int start) 
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) 
        {

            int i = stack.pop();

            if (i < 0 || i >= arr.length || arr[i] < 0) 
            {
                continue;
            }

            if (arr[i] == 0) 
            {
                return true;
            }

            int jump = arr[i];

            arr[i] = -arr[i];

            stack.push(i + jump);
            stack.push(i - jump);
        }

        return false;
    }
}