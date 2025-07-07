class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int arr[]=new int[2*n];
        int temp=0,temp1=n;
        for(int i=0;i<2*n;i+=2)
        {
            arr[i]=nums[temp];
            arr[i+1]=nums[temp1];
            temp++;
            temp1++;
        }
        return arr;
    }
}