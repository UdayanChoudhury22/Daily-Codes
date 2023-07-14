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
            System.out.println(ob.maxSubstring(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String S) {
        // code here
        int n = S.length();
        int max_sum = 0;
        int curr_sum = 0;
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i) == '0')
                curr_sum += 1;
            else
                curr_sum += -1;
                
            if(curr_sum < 0)
                curr_sum = 0;
            
            max_sum = Math.max(curr_sum,max_sum);
        }
        if(max_sum ==0 )
            max_sum = -1;
        return max_sum;
    }
}
