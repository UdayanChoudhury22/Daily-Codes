//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String s = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.isEven(s,n))
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        // code here
        int x = s.length()-1;
        for(int i = x;i>=0;i--)
        {
            
            if(Character.isDigit(s.charAt(i)))
            {
                int num = s.charAt(i) - '0';
                if(num == 0)
                    continue;
                if(num%2 == 0)
                    return true;
                if(num%2 != 0 )
                    return false;
            }
            else
                continue;
            
        }
        return false;
    }
} 