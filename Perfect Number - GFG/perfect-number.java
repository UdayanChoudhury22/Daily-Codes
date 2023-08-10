//{ Driver Code Starts
// Initial Template for Java

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
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int fact(int num)
    {
        int f = 1;
        if(num==0 || num==1)
            return 1;
        if(num<0)
            return 0;
            
        while(num>0)
        {
            f *= num;
            num--;
        }
        return f;
    }
    int isPerfect(int N) {
        // code here
        int org = N;
        int sum = 0;
        while(N>0)
        {
            sum+=fact(N%10);
            N/=10;
        }
        if(sum == org)
            return 1;
        return 0;
    }
}