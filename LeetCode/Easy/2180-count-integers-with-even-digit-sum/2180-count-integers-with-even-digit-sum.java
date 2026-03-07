class Solution 
{
    public int countEven(int num) 
    {
        int sum = 0;
        int n = num;

        while (n > 0) 
        {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 2 == 0) 
        {
            return num / 2;
        } 
        else 
        {
            return (num - 1) / 2;
        }
    }
}