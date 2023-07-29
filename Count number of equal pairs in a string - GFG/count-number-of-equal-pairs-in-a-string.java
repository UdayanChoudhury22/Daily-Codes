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
            System.out.println (new Sol().equalPairs (s));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java


class Sol
{
    long equalPairs (String s)
    {
        // your code here
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        
        for(Map.Entry<Character,Integer> val : map.entrySet())
        {
            if(val.getValue() == 1)
                count += val.getValue();
            else
                count += val.getValue()*val.getValue();
        }
        
        return count;
    }
}