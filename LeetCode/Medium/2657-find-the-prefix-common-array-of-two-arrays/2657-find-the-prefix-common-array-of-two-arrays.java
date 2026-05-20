class Solution 
{
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n = A.length;

        int[] ans = new int[n];

        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) 
        {

            if (seenB[A[i]]) 
            {
                common++;
            }

            if (seenA[B[i]]) 
            {
                common++;
            }

            if (A[i] == B[i]) 
            {
                common++;
            }

            seenA[A[i]] = true;
            seenB[B[i]] = true;

            ans[i] = common;
        }

        return ans;
    }
}