//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    if(obj.decode(s))
                        System.out.println("1");
                        
                    else
                        System.out.println("0");
                        
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean decode(String S)
    {
        //code here
        // S = S.toLowerCase();
        String str = "hello";
        int i=0;
        for(int j=0;j<S.length();j++)
        {
            char ch = S.charAt(j);
            if(ch == str.charAt(i))
                i++;
            if(i == str.length())
                return true;
        }
        return false;
    }
}