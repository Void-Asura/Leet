class Solution 
{
    public void sortColors(int[] nums) 
    {
        int red=0,white=0,blue=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            red++;
            if(nums[i]==1)
            white++;
            if(nums[i]==2)
            blue++;
        }
        white+=red;
        blue+=white;
        for(int i=0;i<nums.length;i++)
        {
            if(i<red)
            nums[i]=0;
            else if(i>=red && i<white)
            nums[i]=1;
            else if(i>=white && i<blue)
            nums[i]=2;
        }
    }
}