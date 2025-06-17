class Solution 
{
    public int smallestNumber(int n, int t) 
    {
        boolean ch=true;
        while(ch)
        {
            int temp=n,prod=1;
            while(temp>0)
            {
                prod*=temp%10;
                temp/=10;
            }
            if(prod%t==0)
            return n;
            else
            n++;
        }
        return 0;
    }
}