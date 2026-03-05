class Solution 
{
    public int minOperations(String s) 
    {
        int start0 = 0;
        int start1 = 0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c != (i%2==0 ? '0' : '1'))
                start0++;

            if(c != (i%2==0 ? '1' : '0'))
                start1++;
        }

        return Math.min(start0,start1);
    }
}