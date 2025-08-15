class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if((Math.log(n)/Math.log(4))==Math.ceil((Math.log(n)/Math.log(4)))&&n!=0)
        return true;
        else
        return false;
    }
}