//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    Complete obj = new Complete();
		    boolean ans = obj.saveIronman(line);
        	if(ans == true)
        	    System.out.println("YES");
		    else
		        System.out.println("NO");
		    
		}
	}
}








// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static boolean saveIronman (String s) {
        //Complete the function
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch <= 'Z') || (ch>='0' && ch<= '9'))
                sb.append(ch);
        }
        
        String res = sb.toString().toLowerCase();
        for(int i=0;i<res.length()/2;i++)
        {
            if(res.charAt(i) != res.charAt(res.length()-1-i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
            return true;
        return false;
    }
    
    
}
