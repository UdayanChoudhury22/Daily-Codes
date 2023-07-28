//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void main(String args[])throws IOException
	{
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());   
        while(t-->0)
        {
            // long n = Long.parseLong(br.readLine().trim());
            int a[] = new int[10];
            
            String line = read.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            
            for (int i = 0; i < 10; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.findDuplicate(a));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public int findDuplicate(int A[])
    {
        // Your code goes here
        Arrays.sort(A);
        if(A[0]==A[4])
            return A[0];
            
        if(A[1] == A[5])
            return A[1];
            
        if(A[2] == A[6])
            return A[2];
            
        if(A[3] == A[7])
            return A[3];
            
        if(A[4] == A[8])
            return A[4];
            
        if(A[5] == A[9])
            return A[5];
        return -1;
    }
}

// class Compute {
    
//     public int findDuplicate(int a[])
//     {
//         if (a[3] == a[4])
//             return a[3];
//         else if (a[4] == a[5])
//             return a[4];
//         return a[5];
//     }
// }