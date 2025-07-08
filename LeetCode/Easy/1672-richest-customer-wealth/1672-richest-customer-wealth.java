class Solution {
    public int maximumWealth(int[][] accounts) {
        int w=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
                int temp =0;
            for(int j=0;j<accounts[i].length;j++){
                temp += accounts[i][j];
            }
            w=Math.max(w,temp);
        }
        return w;
    }
}