//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static boolean check(String s1,String s2)
    {
        int count = 0;
        if(s1.equals(s2))
            return false;
        for(int i=0;i<s1.length();i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(ch1 != ch2)
                count++;
            
            if(count > 1)
                return false;
        }
        return true;
    }
    static String isStringExist(String arr[],int N,String S){
        // code here
        int size = S.length();
        for(int i=0;i<N;i++)
        {
            if(size == arr[i].length())
            {
                if(check(arr[i],S))
                    return "True";
            }
        }
        return "False";
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split(" ");
            String X =read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.isStringExist(input_line, N, X));
        }
    }
}
// } Driver Code Ends