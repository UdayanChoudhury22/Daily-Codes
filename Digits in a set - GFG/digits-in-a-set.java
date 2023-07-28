//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            long ans = new Solution().countNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int countNumbers(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++)
        {
            boolean flag = true;
            int value = i;
            while(value>0)
            {
                int rem = value%10;
                if(rem != 1 && rem != 2 && rem != 3 && rem != 4 && rem != 5)
                {
                    flag = false;
                    break;
                }
                value /= 10;
            }
            if(flag)
                count++;
        }
        return count;
    }
}



