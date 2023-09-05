//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solve().addOne(a, n);
            printAns(ans);
        }
    }
    public static void printAns(Vector<Integer> ans) {
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
        System.out.println();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    // function for adding one to number
    Vector<Integer> addOne(int[] arr, int n) {
        // code here
        Vector<Integer> v = new Vector<>();
        int rem = 1;
        for(int i=n-1;i>=0;i--)
        {
            int num = arr[i];
            int sum = num + rem;
            int val = sum%10;
            v.add(val);
            rem = sum/10;
        }
        if(rem!=0)
            v.add(rem);
        
        Collections.reverse(v);
        
        return v;
    }
}