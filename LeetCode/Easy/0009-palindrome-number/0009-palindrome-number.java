class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp=x,n=0;
        while(temp>0)
        {
            n=n*10 + temp%10;
            temp/=10;
        }
        return n==x;
    }
}