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
            
            Solution obj = new Solution();
            List<Long> answer = obj.PosNegPair(a, n);
            int sz = answer.size();
            
            if(sz==0)
            System.out.println(0);
            
            else{
                StringBuilder output = new StringBuilder();
                for(long x : answer)
                output.append(x+" ");
                System.out.println(output);
            }
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    
    public List<Long> PosNegPair(long a[], long n)
    {
    
     List<Long> list=new ArrayList<Long>();
     HashMap<Long,Integer> hs=new HashMap<Long,Integer>();
     Arrays.sort(a);
     for(int i=0;i<n;i++){
         if(hs.containsKey(-a[i])){
             list.add(-Math.abs(a[i]));
             list.add(Math.abs(a[i]));
             hs.put(-a[i],hs.get(-a[i])-1);
             if(hs.get(-a[i])==0){
                 hs.remove(-a[i]);
             }
         }
         else if(hs.containsKey(a[i])){
             hs.put(a[i],hs.get(a[i])+1);
         }
         else{
             hs.put(a[i],1);
         }
     }
         return list;
             }
         }