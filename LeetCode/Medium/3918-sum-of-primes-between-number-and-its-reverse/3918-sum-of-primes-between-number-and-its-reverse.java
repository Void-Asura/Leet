class Solution 
{
    public int sumOfPrimesInRange(int n) 
    {
        int original = n;

        int rev = 0;

        while (n > 0) 
        {

            rev = rev * 10 + n % 10;
            n /= 10;
        }

        int start = Math.min(original, rev);
        int end = Math.max(original, rev);

        int sum = 0;

        for (int i = start; i <= end; i++) 
        {

            if (isPrime(i))
                sum += i;
        }

        return sum;
    }

    public boolean isPrime(int n) 
    {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) 
        {

            if (n % i == 0)
                return false;
        }

        return true;
    }
}
