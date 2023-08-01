//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Str{
    String val;
    public Str(String val){
        this.val = val;
    }
}

class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    Str a = new Str(sc.next());
                    Str b = new Str(sc.next());
                    Solution ob = new Solution();
                    ob.swapDigits(a,b);
                    System.out.println(a.val + " " + b.val);
                }
        }
}
// } Driver Code Ends


//User function Template for Java


/*
class Str{
    String val;
    public Str(String val){
        this.val = val;
    }
}
*/
class Solution{
    void swapDigits(Str n1, Str n2){
         String f1=Character.toString(n1.val.charAt(0));

        String f2=Character.toString(n2.val.charAt(0));

        String e1=Character.toString(n1.val.charAt(n1.val.length()-1));

        String e2=Character.toString(n2.val.charAt(n2.val.length()-1));

        n1.val=e2+n1.val.substring(1,n1.val.length()-1)+f2;

        n2.val=e1+n2.val.substring(1,n2.val.length()-1)+f1;
    }
}