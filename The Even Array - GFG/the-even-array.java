//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.convertToEven(S));
                }
        }
}
// } Driver Code Ends



class Solution
{
    public int convertToEven(String s)
    {
        // Your code goes here
        
        int count = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='O'){
                count++;
                while(i<s.length() && s.charAt(i)=='O'){
                    i++;
                }
            }
            i++;
        }
        return count;
    }
}