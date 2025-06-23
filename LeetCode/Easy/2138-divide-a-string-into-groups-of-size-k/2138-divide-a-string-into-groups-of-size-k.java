class Solution 
{
    public String[] divideString(String s, int k, char fill) 
    {
        if(s.length()<k)
        {
            StringBuffer sbr=new StringBuffer(s);
            while(sbr.length()<k)
            sbr.append(fill);

            return new String[]{sbr.toString()};
        }
        else
        {
            List<String> ls=new ArrayList<>();
            StringBuffer sbr=new StringBuffer(s);
            while(sbr.length()>0)
            {
                if(sbr.length()>=k)
                {
                    ls.add(sbr.substring(0,k).toString());
                    sbr.delete(0,k);
                }
                else
                {
                    while(sbr.length()<k)
                    {
                        sbr.append(fill);
                    }
                    ls.add(sbr.toString());
                    break;
                }
            }
            return ls.toArray(new String[0]);
        }
    }
}