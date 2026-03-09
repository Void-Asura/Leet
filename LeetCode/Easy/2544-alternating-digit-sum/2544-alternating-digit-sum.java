class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int temp = n;
        int digits = 0;

        while (temp > 0) 
        {
            digits++;
            temp /= 10;
        }

        int sign = (digits % 2 == 0) ? -1 : 1;
        int sum = 0;

        while (n > 0) 
        {
            int digit = n % 10;
            sum += digit * sign;

            sign *= -1;
            n /= 10;
        }

        return sum;
    }
}