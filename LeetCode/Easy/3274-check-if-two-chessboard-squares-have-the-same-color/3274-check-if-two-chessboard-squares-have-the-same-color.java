class Solution 
{
    public boolean checkTwoChessboards(String c1, String c2) 
    {
        int col1 = c1.charAt(0) - 'a' + 1;
        int row1 = c1.charAt(1) - '0';

        int col2 = c2.charAt(0) - 'a' + 1;
        int row2 = c2.charAt(1) - '0';

        int sum1 = col1 + row1;
        int sum2 = col2 + row2;

        return (sum1 % 2) == (sum2 % 2);
    }
}