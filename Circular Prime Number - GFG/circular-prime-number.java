//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int n = Integer.parseInt(S[0]);
            Solution ob = new Solution();
            int ans = ob.isCircularPrime(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static boolean isPrime(int n)
    {
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int isCircularPrime(int n)
    {
        // code here
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        int temp = n;
        int dig = 0;
        while(temp>0)
        {
            if(temp%2 == 0)
                return 0;
            temp /= 10;
            dig++;
        }
        
        int q = (int)Math.pow(10,dig-1);
        for(int i=0;i<dig;i++)
        {
            if(!isPrime(n))
                return 0;
            
            int rem = n %10;
            n = n/10;
            n = (q*rem)+n;
        }
        return 1;
    }
}