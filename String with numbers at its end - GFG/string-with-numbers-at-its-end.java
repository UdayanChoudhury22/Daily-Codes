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
            
            Solution ob = new Solution();
            int result = ob.isSame(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
        String temp = "";
        int num = 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                num = num*10 + ch -'0';
            if(Character.isLetter(ch))
                count++;
        }
        if(num == count)
            return 1;
        return 0;
    }
}






