class Solution 
{
    public String makeFancyString(String s) 
    {
        // int len=1;
        // char arr[]=s.toCharArray();        
        // char ch=arr[0];
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i]==ch)
        //     {
        //         len++;
        //         if(len>2)
        //         {
        //             arr[i]='-';
        //         }
        //     }
        //     else
        //     {
        //         ch=arr[i];
        //         len=1;
        //     }
        // }
        // String str="";
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]!='-')
        //     {
        //         str+=String.valueOf(arr[i]);
        //     }
        // }
        // return str;

        // int c=1,i=0;
        // StringBuilder sbr=new StringBuilder(s);
        // while(i<sbr.length())
        // {
        //     if(i>0 && sbr.charAt(i)==sbr.charAt(i-1))
        //     {
        //         if(c==2)
        //         {
        //             sbr.deleteCharAt(i);
        //         }
        //         else
        //         {
        //             c++;
        //             i++;
        //         }
        //     }
        //     else
        //     {
        //         c=1;
        //         i++;
        //     }
        // }
        // return sbr.toString();

        int c = 1, i = 1;
    StringBuilder sbr = new StringBuilder(s);
    
    while (i < sbr.length()) {
        if (sbr.charAt(i) == sbr.charAt(i - 1)) {
            c++;
            if (c > 2) {
                sbr.deleteCharAt(i); 
                continue; 
            }
        } else {
            c = 1; 
        }
        i++;
    }
    
    return sbr.toString();
    }
}