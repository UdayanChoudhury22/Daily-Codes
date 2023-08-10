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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fact(int num)
    {
        int f = 1;
        if(num==0 || num==1)
            return 1;
        while(num>0)
        {
            f *= num;
            num--;
        }
        return f;
    }
    static int isStrong(int N) {
        // code here
        int sum = 0;
        int org = N;
        while(N>0)
        {
            int rem = N%10;
            sum += fact(rem);
            N/=10;
        }
        if(sum == org)
            return 1;
        return 0;
    }
};