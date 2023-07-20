//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            
            // input n array elements
            String s = read.readLine();

            Solution ob = new Solution();
        
            System.out.println(ob.amendSentence(s));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

 class Solution{
    public String amendSentence(String s){
        //code here
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                sb.append(' ');
                sb.append(Character.toLowerCase(ch));
            }
            else
            {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}

