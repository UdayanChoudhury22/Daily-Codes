//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        String ans = "";
        
            while(N > 0){
                int rem = N%2;
                ans += String.valueOf(rem);
                
                N = N/2;
            }
        
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        
        String zero = "";
        for(int i = 1; i < 32-ans.length()-1; i++){
            zero += "0";
        }
        
        ans = zero + sb.toString();
        
        return ans;
    }
}