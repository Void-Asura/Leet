class Solution 
{
    public String sortVowels(String s) 
    {
        char arr[]=s.toCharArray();
        int v[]=new int[10];
        for(int i=0;i<s.length();i++)
        {
            if("AEIOUaeiou".indexOf(s.charAt(i))>=0)
            {
                v["AEIOUaeiou".indexOf(s.charAt(i))]++;
            }
        }

        String temp="";
        for(int i=0;i<v.length;i++)
        {
            if(v[i]>0)
            {
                while(v[i]>0)
                {
                temp+="AEIOUaeiou".charAt(i);
                v[i]--;
                }
            }
        }

        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if("AEIOUaeiou".indexOf(arr[i])>=0)
            {
                arr[i]=temp.charAt(k);
                k++;
            }
        }

        return new String(arr);
    }
}