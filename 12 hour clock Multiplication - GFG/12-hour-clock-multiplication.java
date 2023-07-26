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
            String S[] = read.readLine().split(" ");
            
            int num1 = Integer.parseInt(S[0]);
            int num2 = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.mulClock(num1,num2));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int mulClock(int num1, int num2) {
        
        int pdt = num1*num2;    // Product of the Numbers
        int ans = pdt%12;      // Remainder of the Product when divided by 12.
        
        return ans;
    }
};