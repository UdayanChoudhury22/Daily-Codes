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
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        }
    }
}
// } Driver Code Ends




class Solution {
    static String convertToHex(int num)
    {
        StringBuilder z=new StringBuilder();
        while (num!=0)
        {
            
            int rem=num%16;
            char c;
            if (rem<10)
            {
                c=(char)(rem+48);
            }
            else
            {
                c=(char)(rem+87);
            }
            z.append(c);
            num=num/16;
            
        }
        return z.toString();
         
    }
    static String encryptString(String S){
        // code here
        
        
         
        StringBuilder w=new StringBuilder();
        int n=S.length();

        for (int i=0;i<n;i++)
        {
            int count=0;
            String hex;
            char c=S.charAt(i);
            while (i<n && S.charAt(i)==c)
            {
                count++;
                i++;
            }
            i--;
            hex=convertToHex(count);
            w.append(c);
            w.append(hex);
            
            
        }
        w.reverse();
        return w.toString();
     
        
        
        
        
    }
};