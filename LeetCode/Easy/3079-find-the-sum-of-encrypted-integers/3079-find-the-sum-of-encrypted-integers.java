class Solution 
{
    public int sumOfEncryptedInt(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i],m=0,len=0,n1=0;
            while(temp>0)
            {
                len++;
                m=Math.max(m,temp%10);
                temp/=10;
            }
            while(len>0)
            {
                n1=n1*10+m;
                len--;
            }
            sum+=n1;
        }
        return sum;
    }
}