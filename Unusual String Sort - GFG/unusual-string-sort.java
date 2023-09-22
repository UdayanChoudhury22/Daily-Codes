//{ Driver Code Starts
//Initial Template for Java

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
            String s = sc.next ();
    		System.out.println (new Sol().stringSort (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static String stringSort (String s)
    {
        // your code here
        StringBuilder u = new StringBuilder();
        StringBuilder l = new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                u.append(ch);
            else
                l.append(ch);
        }
        
        char[] upper = u.toString().toCharArray();
        char[] lower = l.toString().toCharArray();
        
        Arrays.sort(upper);
        Arrays.sort(lower);
        int m = upper.length;
        int n = lower.length;
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(m>0 && n>0)
        {
            sb.append(upper[i]);
            sb.append(lower[i]);
            i++;
            m--;
            n--;
        }
        
        while(m>0)
        {
            sb.append(upper[i]);
            m--;
            i++;
        }
        while(n>0)
        {
            sb.append(lower[i]);
            n--;
            i++;
        }
        
        return sb.toString();
    }
}