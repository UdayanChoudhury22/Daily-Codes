//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String st = in.readLine();
            String et = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.timeGap(st, et));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String timeGap(String st, String et){
        // code here
        int start_hour = Integer.valueOf(st.substring(0,2));
        int start_min = Integer.valueOf(st.substring(3,5));
        int start_sec = Integer.valueOf(st.substring(6,8));
        
        int start = start_hour*3600 + start_min*60 + start_sec;
        
        int end_hour = Integer.valueOf(et.substring(0,2));
        int end_min = Integer.valueOf(et.substring(3,5));
        int end_sec = Integer.valueOf(et.substring(6,8));
        
        int end = end_hour*3600 + end_min*60 + end_sec;
        
        int remaining = end - start;
        int hour = (remaining/3600);
        remaining -= (hour*3600);
        int min = remaining / 60;
        remaining -= (min*60);
        int sec =remaining;
        
        StringBuilder sb = new StringBuilder();
        if(hour<10)
        {
            sb.append(0);
            sb.append(hour);
            sb.append(':');
        }
        else{
            sb.append(hour);
            sb.append(':');
        }
        
        if(min<10)
        {
            sb.append(0);
            sb.append(min);
            sb.append(':');
        }
        else{
            sb.append(min);
            sb.append(':');
        }
        
        if(sec<10)
        {
            sb.append(0);
            sb.append(sec);
            // sb.append(:);
        }
        else{
            sb.append(sec);
            // sb.append(:);
        }
        
        return sb.toString();
    }
}