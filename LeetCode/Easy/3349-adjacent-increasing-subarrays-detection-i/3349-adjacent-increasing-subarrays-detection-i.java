class Solution 
{
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) 
    {
         for(int i=0; i + 2*k <= nums.size(); i++)
        {
            int f1=0, f2=0;
            for(int j=i+1; j<i+k; j++)
            {
                if(nums.get(j) <= nums.get(j-1))
                {
                    f1=1;
                    break;
                }
            }
            for(int l=i+k+1; l<i+2*k; l++)
            {
                if(nums.get(l) <= nums.get(l-1))
                {
                    f2=1;
                    break;
                }
            }

            if(f1==0 && f2==0)
            return true;
        }

        return false;
    }
}