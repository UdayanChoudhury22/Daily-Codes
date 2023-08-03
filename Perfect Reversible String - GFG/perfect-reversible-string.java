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
                    int n = sc.nextInt();
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.isReversible(s, n));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int isReversible(String a, int n) 
    { 
        StringBuilder res = new StringBuilder(a).reverse();
        return (res.toString().equals(a)? 1:0); 
    } 
}