//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            ob.reArrange(arr,N);
            
            System.out.println(check(arr,N));
        }
    }
    static int check(int arr[], int n)
    {
        int flag = 1;
        int c=0, d=0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                if(arr[i]%2==1)
                {
                    flag = 0;
                    break;
                }
                else
                    c++;
            }
            else
            {
                if(arr[i]%2==0)
                {
                    flag = 0;
                    break;
                }
                else
                    d++;
            }
        }
        if(c!=d)
            flag = 0;
                
        return flag;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int even = 0;
        int odd = 1;
        while(even<N && odd<N)
        {
            if(arr[even]%2 !=0 && arr[odd]%2 ==0)
            {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
                even+=2;
                odd+=2;
            }
            else if(arr[even]%2 ==0 && arr[odd]%2 ==0)
            {
                even+=2;
            }
            else if(arr[even]%2 !=0 && arr[odd]%2 !=0)
                odd+=2;
            else
            {
                even+=2;
                odd+=2;
            }
        }
    }
};