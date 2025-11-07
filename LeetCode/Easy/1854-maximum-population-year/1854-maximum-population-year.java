class Solution 
{
    public int maximumPopulation(int[][] logs) 
    {
        int[] years = new int[2051];

        for (int[] log : logs) 
        {
            years[log[0]]++;
            years[log[1]]--;
        }

        int maxYear = 1950;
        int maxPop = 0;
        int currPop = 0;

        for (int year = 1950; year <= 2050; year++) 
        {
            currPop += years[year];
            if (currPop > maxPop) 
            {
                maxPop = currPop;
                maxYear = year;
            }
        }

        return maxYear;
    }
}