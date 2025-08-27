class Solution 
{
    public List<String> commonChars(String[] words) 
    {
        int arr[]=new int[26];
        Arrays.fill(arr,Integer.MAX_VALUE);
        for(String s:words)
        {
            int arr1[]=new int[26];
            for(char c:s.toCharArray())
            {
                arr1[c-'a']++;
            }
            for(int j=0;j<26;j++)
            {
                arr[j]=Math.min(arr[j],arr1[j]);
            }
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ls.add(String.valueOf((char)(i + 'a')));
            }
        }
        return ls;
    }
}