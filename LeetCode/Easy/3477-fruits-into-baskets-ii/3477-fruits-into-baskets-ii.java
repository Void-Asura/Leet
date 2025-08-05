class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int counter=0,nos=fruits.length;
        for(int i=0;i<fruits.length;i++)
        {   int k=0;
            for(;k<baskets.length;k++)
            {
                if(fruits[i]<=baskets[k])
                {
                    nos--;
                    baskets[k]=-1;
                    break;
                }
                if (k==baskets.length)
                return nos; 
            }
        }
        return nos;
    }
}