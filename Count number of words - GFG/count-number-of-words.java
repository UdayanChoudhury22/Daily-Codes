//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.countWords(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countWords(String s) 
    { 
        s = s.replace("\\n"," ");
        s = s.replace("\\t"," ");
        s = s.replaceAll("[ ]+"," ");//done for removing more than one space
        String str[] =s.trim().split(" ");
        return str.length;
        //The trim() in Java is used to eliminate all leading and trailing whitespaces in a string.
    }
}