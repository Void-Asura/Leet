class Solution 
{
    public int lengthAfterTransformations(String s, int t) 
    {
        final int MOD=1_000_000_007;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[(int)s.charAt(i)-97]++;
        }
        while(t>0)
        {
            int arr1[]=new int[26];
            for(int i=0;i<26;i++)
            {
                if(i==25 && arr[25]>0)
                {
                    arr1[0]=(arr1[0]+arr[25])%MOD;
                    arr1[1]=(arr1[1]+arr[25])%MOD;
                }
                else if(i<25)
                {
                    arr1[i+1]=(arr1[i+1]+arr[i])%MOD;
                }
            }
            arr=arr1;
            t--;
        }
        int length=0;
        for(int count:arr)
        {
            length=(length+count)%MOD;
        }
        return length;
    }
}