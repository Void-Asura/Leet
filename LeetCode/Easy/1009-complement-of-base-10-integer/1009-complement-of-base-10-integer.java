class Solution 
{
    public int bitwiseComplement(int n) 
    {
        if (n == 0) return 1;

        int res = 0;
        int power = 1;

        while (n > 0) 
        {
            int bit = n % 2;          
            int flipped = 1 - bit;   
            res += flipped * power;  
            power *= 2;
            n /= 2;
        }

        return res;
    }
}