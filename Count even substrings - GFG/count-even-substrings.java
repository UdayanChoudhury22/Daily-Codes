//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S= read.readLine();
            
            Solution ob = new Solution();
            long ans = ob.evenNumSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long evenNumSubstring(String S)
    {
        //Your code here
        long count = 0;
        for(int i=0;i<S.length();i++)
        {
            int num = S.charAt(i) - '0';
            if(num%2==0)
            {
                count++;
                count += i;
            }
        }
        
        
        return count;
    }
}