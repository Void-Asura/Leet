import java.lang.Math;
class Solution 
{
    /*public static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        //return (((int)Math.ceil((Math.log(n)/Math.log(2))))==((int)Math.floor((Math.log(n)/Math.log(2)))));
        double v = Math.log(n) / Math.log(2);
        //System.out.println(v);
        //System.out.println(Math.ceil(v)+"  "+Math.floor(v));
        return (Math.ceil(v) == Math.floor(v));
*/



public boolean isPowerOfTwo(int n) {
        while(n>0){
            if(n==1){
                return true;
            }
            else if(n%2==0){
                n = n/2;
            }
            else{
                return false;
            }
        }
        return false;
}

    
 }