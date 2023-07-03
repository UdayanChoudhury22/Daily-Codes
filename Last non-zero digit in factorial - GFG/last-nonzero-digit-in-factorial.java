//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int ans = ob.lastNon0Digit(N);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    int lastNon0Digit(int N){
        // Code here
        int dig[]={1,1,2,6,4,2,2,4,2,8};
        if(N<10)
            return dig[N];
            
        if(((N/10)%10)%2 == 0)
            return (6*lastNon0Digit(N/5)*dig[N%10]) % 10;
        else
            return (4*lastNon0Digit(N/5)*dig[N%10]) % 10;
    }
    
}
