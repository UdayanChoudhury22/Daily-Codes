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
            System.out.println(ob.minChange(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minChange(String S){
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<S.length();i++)
        {
            set.add(S.charAt(i));
        }
        return S.length() - set.size();
        
    }
}
