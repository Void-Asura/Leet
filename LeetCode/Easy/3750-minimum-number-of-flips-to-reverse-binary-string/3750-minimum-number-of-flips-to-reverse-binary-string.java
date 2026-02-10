class Solution 
{
    public int minimumFlips(int n) 
    {
        String s = Integer.toBinaryString(n);
        int l = 0, r = s.length() - 1;
        int flips = 0;

        while (l < r) 
        {
            if (s.charAt(l) != s.charAt(r))
                flips += 2;

            l++;
            r--;
        }

        return flips;
    }
}