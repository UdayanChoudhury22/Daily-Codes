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
            
            Long L = Long.parseLong(S[0]);
            Long R = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.count3DivNums(L,R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution {
    public static boolean prime(long x) {
        for (long i = 2; i <= (long) Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static int count3DivNums(Long L, Long R) {
        int count = 0;
        for (long i = 2; i <= (long) Math.sqrt(R); i++) {
            if (i * i >= L && prime(i)) {
                count++;
            }
        }
        return count;
    }
};