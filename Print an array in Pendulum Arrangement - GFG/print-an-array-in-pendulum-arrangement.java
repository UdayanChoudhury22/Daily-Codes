//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            int answer[] = obj.pendulumArrangement(arr, n);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
        Arrays.sort(arr);
        int a[] = new int[n];
        if(n%2!=0)
        {
            int k=0;
            for(int i=n-1;i>=0;i=i-2)
            {
                a[k] = arr[i];
                k++;
            }
            for(int i=1;i<n;i+=2)
            {
                a[k] = arr[i];
                k++;
            }
            return a;
        }
        else
        {
            int k=0;
            for(int i=n-2;i>=0;i-=2)
            {
                a[k] = arr[i];
                k++;
            }
            for(int i=1;i<n;i+=2)
            {
                a[k] = arr[i];
                k++;
            }
            return a;
        }
    }
}