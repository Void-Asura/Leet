class Solution 
{
    public int countDigits(int num) 
    {
        String s = String.valueOf(num);
        int count = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            int d = s.charAt(i) - '0';
            if (d != 0 && num % d == 0)
                count++;
        }

        return count;
    }
}