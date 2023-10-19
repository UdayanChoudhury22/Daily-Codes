//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            int answer[] = obj.uniqueId(a, n);
            int sz = answer.length;
            
            for(int i=0;i<sz;i++)
            System.out.print(answer[i]+" ");
            System.out.println();
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public int[] uniqueId(long arr[], long n)
    {
        HashSet<Long> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        
        int res[] = new int[set.size()];
        int j=0;
        for(long x:set)
        {
            res[j] = (int)x;
            j++;
        }
        return res;
    }
}