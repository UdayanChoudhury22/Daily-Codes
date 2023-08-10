//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        if(n<=2)
            return "NO";
        int pre_sum = 0;
        for(int i=0;i<n;i++)
        {
            pre_sum += arr[i];
        }
        /*String s = String.valueOf(pre_sum);
        return s;
        */
        
        int post_sum =0;
        for(int i=0;i<n;i++)
        {
            post_sum += arr[i];
            if(post_sum == pre_sum)
                return "YES";
            else
                pre_sum -= arr[i];
        }
        return "NO";
        
        
        
    }
}