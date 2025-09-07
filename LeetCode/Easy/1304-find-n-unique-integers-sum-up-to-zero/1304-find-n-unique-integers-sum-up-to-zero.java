class Solution 
{
    public int[] sumZero(int n) 
    {
        int []arr=new int[n];
        int in=0;
        for(int i=1;i<=n/2;i++)
        {
            arr[in++]=i;
            arr[in++]=-i;
        }
        if(n%2==1)
        arr[in]=0;
        return arr;
    }
}