class Solution 
{
    public int maxBottlesDrunk(int numBottles, int numExchange) 
    {
        int drink=numBottles,ept=0,res=0;
        while(drink>0)
        {
            drink--;
            ept++;
            res++;
            if(ept==numExchange)
            {
                ept=0;
                numExchange+=1;
                drink++;
            }
        }
        return res;
    }
}