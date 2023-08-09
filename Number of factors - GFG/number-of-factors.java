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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.countFactors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int countFactors(int N) {
        //code here
        if(N<=0)
            return 0;
        if(N==1)
            return 1;
        int sum = 0;
        for(int i=2;i<=N/2;i++)
        {
            if(N%i==0)
                sum++;
        }
        return sum+2;
    }
}