class Solution 
{
    public int compareVersion(String version1, String version2) 
    {
        String[] ar1 = version1.split("\\.");
        String[] ar2 = version2.split("\\.");
        
        int n = Math.max(ar1.length, ar2.length);
        
        for (int i = 0; i < n; i++) 
        {
            int v1 = (i < ar1.length) ? Integer.parseInt(ar1[i]) : 0;
            int v2 = (i < ar2.length) ? Integer.parseInt(ar2[i]) : 0;
            
            if (v1 < v2) return -1;
            if (v1 > v2) return 1;
        }
        return 0;
    }
}