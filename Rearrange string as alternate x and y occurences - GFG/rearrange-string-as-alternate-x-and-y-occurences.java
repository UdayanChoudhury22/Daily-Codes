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
            String[] inp = read.readLine().split(" ");
            int x = Integer.parseInt(inp[0]);
            int y = Integer.parseInt(inp[1]);
            
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            
            System.out.println(ob.arrangeString(s, x, y));
        }
    }
}
// } Driver Code Ends

class Solution
{
    
    public String arrangeString(String str, int x, int y)
    {
        StringBuilder ans = new StringBuilder();
        int count_0 = 0;
        int count_1 = 0;
        int len = str.length();

        //counting the number of 0s and 1s in the string.
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '0')
                count_0++;
            else
                count_1++;
        }

        //arranging the string according to given conditions,
        //until there are remaining 0s or 1s.
        while (count_0 > 0 || count_1 > 0) {
         for (int j = 0; j < x && count_0 > 0; j++) {
            //adding 0 to the answer string x times if count_0 is greater than 0.
            if (count_0 > 0) {
               ans.append(0);
               count_0--;
            }
         }
         for (int j = 0; j < y && count_1 > 0; j++) {
            //adding 1 to the answer string y times if count_1 is greater than 0.
            if (count_1 > 0) {
               ans.append(1);
               count_1--;
            }
          }
        }

        //returning the final arranged string.
        return ans.toString();
    }

}