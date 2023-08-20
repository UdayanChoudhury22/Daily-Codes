//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            
            int arr[] = new int[N];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.ternarySearch(arr, N, K));
        }
    }
}
// } Driver Code Ends



class Solution{

    static int ternarySearch(int arr[], int N, int key)
    {
        // Your code here
        int low = 0;
        int high = N-1;
        while(low<=high)
        {
            int mid1 = low+(high-low)/3;
            int mid2 = high - (high - low)/3;
            
            if(arr[mid1] == key)
                return 1;
            if(arr[mid2] == key)
                return 1;
            if(arr[mid1] > key)
                high = mid1-1;
            else if(arr[mid2] < key)
                low = mid2+1;
            else
            {
                low = mid1+1;
                high = mid2-1;
            }
        }
        return -1;
    }
}

// class Solution{
//     static int ternary(int l, int r, int key, int ar[])
//     {
//         if (r >= l) {
//             int mid1 = l + (r - l) / 3;
//             int mid2 = r - (r - l) / 3;
//             if (ar[mid1] == key) {
//                 return 1;
//             }
//             if (ar[mid2] == key) {
//                 return 1;
//             }
//             if (key < ar[mid1]) {
//                 return ternary(l, mid1 - 1, key, ar);
//             }
//             else if (key > ar[mid2]) {
//                 return ternary(mid2 + 1, r, key, ar);
//             }
//             else {
//                 return ternary(mid1 + 1, mid2 - 1, key, ar);
//             }
//         }
//         return -1;
//     }