import java.util.Hashtable;
class Solution 
{
    
    public int possibleStringCount(String word) 
    {
    //     if(word.length()>1)
    // {
    //     StringBuilder sbr=new StringBuilder(word);
    //     int i=0,tot=1;
    //     while(i<sbr.length()-1)
    //     {
    //         if(sbr.charAt(i)==sbr.charAt(i+1))
    //         {
    //             tot++;
    //             sbr.deleteCharAt(i+1);
    //         }
    //         else
    //         i++;
    //     }
    //     return tot;
    // }
    // else
    // return 1;

    int ans=1;
    char c=word.charAt(0);
    for(int i=1;i<word.length();i++)
    {
        char temp=word.charAt(i);
        if(temp==c)
        {
            ans++;
        }
        else c=temp;
    }
    return ans;
    }
}