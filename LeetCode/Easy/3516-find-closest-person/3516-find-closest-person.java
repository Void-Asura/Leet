class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int dis1=Math.abs(z-x),dis2=Math.abs(z-y);
        if(dis1<dis2)
        return 1;
        else if(dis1>dis2)
        return 2;
        else
        return 0;
    }
}