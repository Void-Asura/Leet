class Solution 
{
    public boolean validDigit(int n, int x) 
    {
        String s = String.valueOf(n);
        char digit = (char) ('0' + x);

        if (s.charAt(0) == digit) 
        {
            return false;
        }

        return s.indexOf(digit) != -1;
    }
}