//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            String A = S[0];
            String B = S[1];

            Solution ob = new Solution();
            System.out.println(ob.karatsubaAlgo(A,B));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long karatsubaAlgo(String A, String B) {
        // code here
        long num1=0l;
        long num2=0l;
        int j=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            num1 += ((A.charAt(i) - '0') * Math.pow(2,j));
            j++;
        }
        
        j=0;
        for(int i=B.length()-1;i>=0;i--)
        {
            num2 += ((B.charAt(i) - '0') * Math.pow(2,j));
            j++;
        }
        return num1*num2;
    }
};