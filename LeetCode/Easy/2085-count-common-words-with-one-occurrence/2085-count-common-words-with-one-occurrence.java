import java.util.Hashtable;
class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        Hashtable<String,Integer> ht1=new Hashtable<>();
        Hashtable<String,Integer> ht2=new Hashtable<>();
        for(int i=0;i<words1.length;i++)
        {
            ht1.put(words1[i],ht1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++)
        {
            ht2.put(words2[i],ht2.getOrDefault(words2[i],0)+1);
        }
        int count=0;
        // for(int value:ht1.values())
        // {
        //     if(value==2)
        //     count++;
        // }
        for(int i=0;i<words1.length;i++)
        {
            if(ht1.get(words1[i])==1 && ht2.getOrDefault(words1[i],0)==1)
            count++;
        }
        return count;

    }
}