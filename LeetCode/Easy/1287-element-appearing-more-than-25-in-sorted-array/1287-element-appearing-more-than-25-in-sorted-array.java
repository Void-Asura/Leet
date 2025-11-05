class Solution 
{
    public int findSpecialInteger(int[] arr) 
    {
        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) 
        {
            if (arr[i] == arr[i - 1]) 
            {
                count++;
            } 
            else 
            {
                if (count * 4 > n) 
                    return arr[i - 1];
                count = 1;
            }
        }

        if (count * 4 > n)
            return arr[n - 1];

        return -1;
    }
}