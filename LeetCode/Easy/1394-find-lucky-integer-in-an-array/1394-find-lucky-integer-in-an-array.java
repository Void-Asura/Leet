import java.util.Hashtable;
class Solution 
{
    public int findLucky(int[] arr) 
    {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<arr.length;i++)
        {
            ht.put(arr[i],ht.getOrDefault(arr[i],0)+1);
        }
        int result=-1;
        for(int key:ht.keySet())
        {
            if(key==ht.get(key) && key>result)
            result=key;
        }
        return result;
    }
}