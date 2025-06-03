class Solution 
{
    public int[] countBits(int n) 
    {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int nos=0,temp=i;
            while(temp>0)
            {
                if(temp%2==1)
                nos++;

                temp/=2;
            }
            arr[i]=nos;
        }
        return arr;
    }
}