class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char [] arr=new char[s.length()];
        int k=0;
        for(int i=0;i<indices.length;i++)
        {
            arr[indices[i]]=s.charAt(k);
            k++;
        }
        return String.valueOf(arr);
    }
}