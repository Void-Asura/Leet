class Solution 
{
    public double trimMean(int[] arr) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        int removeCount = n / 20;
        int start = removeCount;
        int end = n - removeCount;
        
        long sum = 0;
        for (int i = start; i < end; i++) 
        {
            sum += arr[i];
        }
        
        int remaining = end - start;
        return (double) sum / remaining;
    }
}