//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int minValue = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        int n = S.length();
        
        for(int i=0;i<n;i++){
            map.put(S.charAt(i),i);
            if(map.size()==3)
            {
                p = Math.min(map.get('0'),Math.min(map.get('1'),map.get('2')));
                q = Math.max(map.get('0'),Math.max(map.get('1'),map.get('2')));
                minValue = Math.min(minValue, q-p+1);
            }
        }
        if(map.size()<3)
        {
         return -1;
        }
            
        return minValue;
            
    }
}