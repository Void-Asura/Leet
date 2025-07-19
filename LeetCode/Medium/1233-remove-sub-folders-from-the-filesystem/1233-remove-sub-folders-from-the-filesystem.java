class Solution 
{
    public List<String> removeSubfolders(String[] folder) 
    {
        Arrays.sort(folder);
        List<String> ls=new ArrayList<>();
        ls.add(folder[0]);
        String last=folder[0];
        for(int i=1;i<folder.length;i++)
        {
            if(!folder[i].startsWith(last+"/"))
            {
                ls.add(folder[i]);
                last=folder[i];
            }
        }
        return ls;
    }
}