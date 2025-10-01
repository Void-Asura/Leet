class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int full=numBottles,ept=0,drank=0;
        while(full>0)
        {
            full--;
            ept++;
            drank++;
            if(ept==numExchange)
            {
                full++;
                ept=0;
            }
        }
        return drank;
    }
}