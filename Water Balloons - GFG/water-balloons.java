//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String st = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(st));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String sequence(String st){
        // code here
        String ans="";
        int n= st.length();
        char[] arr= st.toCharArray();
        for(int x=0;x<n;x++){
            if(x<2){
                ans+=arr[x];
            }
            else{
                if (!(arr[x]==arr[x-1] && arr[x]==arr[x-2]))
                    ans+=arr[x];
                    
            }
        }
        return ans;
    }
}