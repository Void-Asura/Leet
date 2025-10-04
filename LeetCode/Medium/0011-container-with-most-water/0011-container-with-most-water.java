class Solution 
{
    public int maxArea(int[] height) 
    {
        int amt=0,l=0,r=height.length-1;

        while(l<r)
        {
            int len=r-l;
            amt=Math.max(Math.min(height[l],height[r])*len,amt);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return amt;
    }
}