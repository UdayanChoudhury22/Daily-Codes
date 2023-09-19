//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            char[] charArray = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            Arrays.sort(charArray);
            int sum =0;
            int start = 0;
            for(int i=0;i<s.length();i++)
            {
                if(charArray[i] >= '0' && charArray[i] <= '9')
                    sum += charArray[i] - '0';
                else{
                    start = i;
                    break;
                }
            }
            
            for(int i=start;i<s.length();i++)
            {
                sb.append(charArray[i]);
            }
            if(sum!=0)
                sb.append(sum);
            else
                return sb.toString();
            return sb.toString();
            
        }
}
