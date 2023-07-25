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
            
            if (ob.passed(s)==true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean passed(String s)
    {
        // your code here
        if(s.length()%2!=0){
            String str = s.substring(0,s.length()/2);
            String str1 = s.substring(s.length()/2+1);
            char arr[] = str.toCharArray();
            char brr[] = str1.toCharArray();
            
            Arrays.sort(arr);
            Arrays.sort(brr);
            for(int i= 0;i<arr.length;i++){
                if(arr[i]!=brr[i])
                return false;
            }
        }
        else{
            String str = s.substring(0,s.length()/2);
            String str1 = s.substring(s.length()/2);
            char arr[] = str.toCharArray();
            char brr[] = str1.toCharArray();
            
            Arrays.sort(arr);
            Arrays.sort(brr);
            for(int i= 0;i<arr.length;i++){
                if(arr[i]==brr[i])
                continue;
                else
                return false;
            }
            
        }
        return true;
    }
}