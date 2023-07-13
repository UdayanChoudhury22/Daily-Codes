//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends

class Solution{
    static String common(String s1,String s2)
    {
        StringBuilder sb = new StringBuilder();
        
        int n = Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
                sb.append(s1.charAt(i));
            else
                break;
        }
        return sb.toString();
    }
    String longestCommonPrefix(String arr[], int n){
        // code here
        String res = arr[0];
        for(int i=0;i<n;i++)
        {
            res = common(res,arr[i]);
        }
        if(res.length() == 0)
            res = "-1";
        return res;
    }
}