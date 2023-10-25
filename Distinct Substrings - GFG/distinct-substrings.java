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
            int ans = ob.fun(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


class Solution 
{ 
    int fun(String s) 
    {
        // code here
        int n = s.length();
        //int count = 0;
        String str = "";
        // ArrayList<String> res = new ArrayList<String>();
        Set<String> res = new HashSet<String>();
        for(int i = 1; i < n ; i++){
            if(s.charAt(i) != s.charAt(i-1) || s.charAt(i) == s.charAt(i-1)){
                str = Character.toString(s.charAt(i-1)) + Character.toString(s.charAt(i));
                res.add(str);
                //System.out.println(res);
                }
            }
        return res.size();
    }
} 