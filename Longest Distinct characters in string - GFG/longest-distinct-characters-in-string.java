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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        String sb="";
        sb=sb+S.charAt(0);
    
        int maxLen=0,len=1;
        
        for(int i=1;i<S.length();i++){
            char ch=S.charAt(i);
            int idx=sb.indexOf(ch);
            if(idx!=-1){
                maxLen=Math.max(len,maxLen);
                sb=sb.substring(idx+1);
            }
                sb=sb+ch;
                len=sb.length();
        }
        
        
        return Math.max(maxLen,len);
        
    }
}