class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int []arr=new int[nums.length];int l=0,r=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[l]=nums[i];
                l++;
            }
            else
            {
                arr[r]=nums[i];
                r--;
            }
        }
        return arr;
    }
}