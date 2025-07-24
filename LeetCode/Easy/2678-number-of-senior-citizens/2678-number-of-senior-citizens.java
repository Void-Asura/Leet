class Solution 
{
    public int countSeniors(String[] details) 
    {
        int noc=0;
        for(int i=0;i<details.length;i++)
        {
            String str=details[i];
            int age=Integer.parseInt(str.substring(11,13));
            if(age>60)
            noc++;
        }
        return noc;
    }
}