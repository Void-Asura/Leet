class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int arr[]=new int[2];
        for(int i=0;i<numbers.length-1;i++)
        {
            int num=numbers[i],len=numbers.length-1;
            while(len>i)
            {
                if(numbers[len]==(target-num))
                {
                    arr[0]=i+1;
                    arr[1]=len+1;
                    return arr;
                }
                else
                len--;
            }
        }
        return arr;
    }
}