class Solution 
{
    public int totalFruit(int[] fruits) 
    {
       int t1 = fruits[0], t2 = -1;
        int f1 = 1, f2 = 0;
        int last = 1;
        int max = 0;

        for (int i = 1; i < fruits.length; i++) 
        {
            if (fruits[i] == t1) 
            {
                f1++;
                if (fruits[i] == fruits[i - 1]) last++;
                else last = 1;
            } 
            else if (t2 == -1 || fruits[i] == t2) 
            {
                if (t2 == -1) t2 = fruits[i];
                f2++;
                if (fruits[i] == fruits[i - 1]) last++;
                else last = 1;
            } 
            else 
            {
                max = Math.max(max, f1 + f2);
                t1 = fruits[i - 1];
                t2 = fruits[i];
                f1 = last;
                f2 = 1;
                last = 1;
            }
        }

        max = Math.max(max, f1 + f2);
        return max;
    }
}