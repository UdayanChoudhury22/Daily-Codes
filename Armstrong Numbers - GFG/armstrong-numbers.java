//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends



//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int org = n,temp = n;
        int dig = 0;
        int sum = 0;
        // int count = 0;
        while(n>0)
        {
            dig++;
            n /= 10;
        }
        
        while(temp>0)
        {
            int rem = temp%10;
            sum += Math.pow(rem,dig);
            temp /= 10;
        }
        if(sum == org)
            return "Yes";
        return "No";
    }
}