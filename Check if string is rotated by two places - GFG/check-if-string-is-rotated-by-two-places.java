//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length() <=2)
        {
            if(str1.equals(str2))
                return true;
            else
                return false;
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i=2;i<str1.length();i++)
            sb1.append(str1.charAt(i));
        sb1.append(str1.charAt(0));
        sb1.append(str1.charAt(1));
        
        
        StringBuilder sb2 = new StringBuilder();
        for(int i = str1.length() - 2;i<str1.length();i++)
            sb2.append(str1.charAt(i));
        for(int i=0;i<str1.length() - 2;i++)
        {
            sb2.append(str1.charAt(i));
        }
        
        if(sb1.toString().equals(str2) || (sb2.toString().equals(str2)))
            return true;
        return false;
    }
    
}