//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        int n=A.length();
        int m=B.length();
        if(n!=m)return -1;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=A.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        for(int i=0;i<m;i++){
            char ch=B.charAt(i);
            if(hm.containsKey(ch)){
                 hm.put(ch,hm.get(ch)-1);
            }
        }
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(e.getValue()!=0){
                return -1;
            }
        }
        int c=0;
        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){
            if(A.charAt(i)==B.charAt(j)){
                i-=1;
                j-=1;
            }
            else{
                c++;
                i-=1;
            }
        }
        return c;
    }
}