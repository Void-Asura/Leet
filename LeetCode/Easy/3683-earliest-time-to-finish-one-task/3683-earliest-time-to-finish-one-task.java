class Solution 
{
    public int earliestTime(int[][] tasks) 
    {
        int minFinish = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++)
        {
            int finish = tasks[i][0] + tasks[i][1];
            minFinish = Math.min(minFinish, finish);
        }

        return minFinish;
    }
}