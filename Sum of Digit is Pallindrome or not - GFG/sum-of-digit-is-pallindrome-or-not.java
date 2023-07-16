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
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int reverse(int num)
    {
        int rev = 0;
        while(num>0)
        {
            int rem = (num%10);
            rev = rev*10+rem;
            num/=10;
        }
        return rev;
    }
    int isDigitSumPalindrome(int N) {
        // code here
        int org = N;
        int sum = 0;
        while(N>0)
        {
            int rem = N%10;
            sum += rem;
            N/=10;
        }
        
        
        if(reverse(sum) == sum)
            return 1;
        return 0;
        
    }
}