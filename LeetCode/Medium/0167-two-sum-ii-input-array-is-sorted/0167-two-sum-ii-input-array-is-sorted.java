class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int arr[]=new int[2];
        // for(int i=0;i<numbers.length-1;i++)
        // {
        //     int num=numbers[i],len=numbers.length-1;
        //     while(len>i)
        //     {
        //         if(numbers[len]==(target-num))
        //         {
        //             arr[0]=i+1;
        //             arr[1]=len+1;
        //             return arr;
        //         }
        //         else
        //         len--;
        //     }
        // }
        int left=0,right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            return new int[]{left+1,right+1};
            else if(sum<target)
            left++;
            else
            right--;
        }
        return arr;
    }
}