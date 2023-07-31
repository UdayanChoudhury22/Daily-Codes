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
            
            String s = sc.next();
            
            int answer = new Solution().isRotatedPalindrome(s);
    		System.out.println(answer);
        }
        
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    static boolean isPalidrome(String str)
    {
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
    int isRotatedPalindrome(String s)
    {
        // Your Code Here 
        if(isPalidrome(s))
            return 1;
        
        for(int i = 0;i<s.length()-1;i++)
        {
            String str = s.substring(i+1) + s.substring(0,i+1);
            if(isPalidrome(str))
                return 1;
        }
        return 0;
        
    }
}

