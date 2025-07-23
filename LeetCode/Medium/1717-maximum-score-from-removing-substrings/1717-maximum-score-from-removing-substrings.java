class Solution 
{
    public int maximumGain(String s, int x, int y) 
    {
        if(x>y)
        {
            return remove(s,x,y,'a','b');
        }
        else
        {
            return remove(s,y,x,'b','a');
        }
    }
    public static int remove(String s, int s1, int s2, char ch1, char ch2)
    {
        char arr[]=s.toCharArray();
        int k=0,total=0;
        for(int i=0;i<s.length();i++)
        {
            arr[k]=arr[i];
            if(k>0 && arr[k-1]==ch1 && arr[k]==ch2)
            {
                total+=s1;
                k--;
            }
            else
            {
                k++;
            }
        }
        int k2=0;
        for(int i=0;i<k;i++)
        {
            arr[k2]=arr[i];
            if(k2>0 && arr[k2-1]==ch2 && arr[k2]==ch1)
            {
                total+=s2;
                k2--;
            }
            else
            {
                k2++;
            }
        }
        return total;
    }
}