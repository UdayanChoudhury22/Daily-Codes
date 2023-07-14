//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.isdivisible7(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    int isdivisible7(String num){
        int n = num.length();

        // Append required 0s at the beginning.
        if (n % 3 == 1) {
            num = num + "00";
            n += 2;
        }
        if (n % 3 == 2) {
            num = num + "0";
            n += 1;
        }

        // add digits in group of three in gSum
        int gSum = 0, p = 1;
        for (int i = n - 1; i >= 0; i--) {

            // group saves 3-digit group
            int group = 0;
            group += num.charAt(i--) - '0';
            group += (num.charAt(i--) - '0') * 10;
            group += (num.charAt(i) - '0') * 100;
            gSum = gSum + group * p;
            // generate alternate series of plus and minus
            p = p * -1;
        }

        // calculate result till 3 digit sum
        if (gSum % 7 == 0)
            return 1;
        return 0;
    }
}