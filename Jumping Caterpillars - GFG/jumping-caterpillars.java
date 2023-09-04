//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java




//User function Template for Java
class GFG
{
    long uneatenLeaves(long arr[], int n,int k)
    {
        int s=arr.length;
        int c=0;
        HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<s;i++){
            int j=(int)arr[i];
            int q=1;
            int w=j;
            if(!l.contains(w)){
            while(w<=n){
                l.add(w);
                w=j*q;
                q++;
            }
        }
        }
        int p=l.size();
        
        
        return n-p;
        
        
          
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[k];
            for (int i = 0; i < k; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            GFG ob = new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans = ob.uneatenLeaves(a,n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends