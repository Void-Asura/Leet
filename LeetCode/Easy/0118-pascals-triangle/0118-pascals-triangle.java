class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ls=new ArrayList<>();
        
        List<Integer>first=new ArrayList<>();
        first.add(1);
        ls.add(first);

        if(numRows>1)
        {
            List<Integer> second=new ArrayList<>();
            second.add(1);
            second.add(1);
            ls.add(second);
        }
        for(int i=2;i<numRows;i++)
        {
            ls.add(Pascal(ls.get(i-1)));
        }
        return ls;
    }
    public static List<Integer> Pascal(List<Integer> lt)
    {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        for(int i=0;i<lt.size()-1;i++)
        {
            ls.add(lt.get(i)+lt.get(i+1));
        }
        ls.add(1);
        return ls;
    }
}