//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.isGoodString(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


class Solution 
{ 
    String isGoodString(String s) 
    { 
        // code here
        if(s.length() == 1){
            return "YES";
        }
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);
            if((ch == 'a' && ch1 == 'z') || (ch == 'z' && ch1 == 'a')){
                continue;
            }
            if(Math.abs(ch1 - ch) != 1)
                return "NO";
        }
        return "YES";
    }
} 