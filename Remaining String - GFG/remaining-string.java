//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s,ch,count);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
        // code here
        for(int i=0;i<S.length();i++)
        {
            if(count>0)
            {
                if(S.charAt(i) == ch)
                    count--;
            }
            else
            {
                return S.substring(i,S.length());
            }
        }
        if(count>0)
            return "Empty string";
        return "Empty string";
    }
}