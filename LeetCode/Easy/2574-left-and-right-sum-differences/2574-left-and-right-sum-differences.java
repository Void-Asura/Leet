class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        int len=nums.length;
        int []leftSum=new int[len];
        int []rightSum=new int[len];
        leftSum[0]=0;
        rightSum[len-1]=0;
        for(int i=1,j=len-2;i<len && j>=0;i++,j--)
        {
            leftSum[i]=leftSum[i-1]+nums[i-1];
            rightSum[j]=rightSum[j+1]+nums[j+1];
        }
        int []answer=new int[len];
        for(int i=0;i<len;i++)
        {
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}