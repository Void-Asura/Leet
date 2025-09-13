class Solution 
{
    public int maxFreqSum(String s) 
    {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<26; i++) {
            if(i==0 || i==4 || i==8 || i==14 || i==20) {
                max1 = Math.max(max1, freq[i]);
            }
            else {
                max2 = Math.max(max2, freq[i]);
            }
        }
        return max1 + max2;
    }
}