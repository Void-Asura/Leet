class Solution 
{
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int mo = -1;
        int in = -1;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
            }

            if (count > mo) {
                mo = count;
                in = i;
            }
        }

        return new int[] {in, mo};
    }
}