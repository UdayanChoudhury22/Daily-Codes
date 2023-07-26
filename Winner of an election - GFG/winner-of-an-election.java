//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        ArrayList<String>a=new ArrayList<>();
        Map<String,Integer>hm=new TreeMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        String temp="";
        int max=-1;
        for(Map.Entry<String,Integer>m:hm.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                temp=m.getKey();
            }
        }
        String[] s=new String[2];
        s[0]=temp;
        s[1]=String.valueOf(max);
        return s;
        
        
    }
}