//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        Stack<Character> stack=new Stack<Character>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!='.')
            {
                stack.push(S.charAt(i));
            }
            else
            {
                while(!stack.isEmpty())
                {
                    str.append(stack.pop());
                }
                  str.append('.');
            }
        }
        while(!stack.isEmpty())
        {
            str.append(stack.pop());
        }
        return str.toString();
}
}
                
                
      