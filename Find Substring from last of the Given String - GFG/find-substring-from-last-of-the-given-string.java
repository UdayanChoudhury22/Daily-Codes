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
            
            String input[] = read.readLine().split(" ");
            String x = input[0];
            String y = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(x, y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String X, String Y) {
        // code here
        int num = -1;
        int n = Y.length();
        for(int i=0;i<=X.length()-n;i++)
        {
            if(X.substring(i,i+n).equals(Y))
            {
                num = i+1;
            }
        }
        return num;
    }
}