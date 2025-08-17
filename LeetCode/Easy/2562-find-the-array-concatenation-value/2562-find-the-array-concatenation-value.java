class Solution 
{
    public long findTheArrayConcVal(int[] nums) 
    {
        long con = 0; 
        int s = 0, e = nums.length - 1;

        if(nums.length == 1)
        {
            return nums[0];
        }

        while(s < e)
        {
            String c = String.valueOf(nums[s]) + String.valueOf(nums[e]);
            s++; 
            e--;
            con += Long.parseLong(c); 
        }

        return s == e ? con + nums[s] : con;
    }
}