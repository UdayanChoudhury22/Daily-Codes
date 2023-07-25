//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.MaximumIntegerValue(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long MaximumIntegerValue(String S) {
        // code here
        long max = 0;
        for(int i=0;i<S.length();i++){
            char ch1 = S.charAt(i);
            
            long num1 = max * Long.parseLong(""+ch1);
            long num2 = max + Long.parseLong(""+ch1);
            max = Math.max(num1,num2);
        }
        return max;
        
    }
}