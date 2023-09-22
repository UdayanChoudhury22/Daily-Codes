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
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    // Method to calculate the length of the longest palindromic subsequence
    int lps(String str) 
    {
        int n = str.length();
        int [][]L= new int[n][n]; 
        
        // Initializing the diagonal elements of the matrix to 1
        for (int i = 0; i < n; i++){ 
            L[i][i] = 1; 
        }
    
        // Filling the remaining cells of the matrix
        for (int cl = 2; cl <= n; cl++) { 
            for (int i = 0; i < n - cl + 1; i++) { 
                int j = i + cl - 1; 
                
                // If the characters at the endpoints are equal and the length is 2
                if (str.charAt(i) == str.charAt(j) && cl == 2) 
                    L[i][j] = 2; 
                
                // If the characters at the endpoints are equal, update the value in the matrix
                else if (str.charAt(i) == str.charAt(j)) 
                    L[i][j] = L[i + 1][j - 1] + 2; 
                
                // If the characters at the endpoints are not equal, take the maximum value from the adjacent cells
                else
                    L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]); 
            } 
        } 
        
        // Returning the length of the longest palindromic subsequence
        return L[0][n - 1]; 
    }
    
    // Method to calculate the minimum number of deletions required to make a string palindrome
    int minDeletions(String str, int n)
    {
        // Calculating the length of the longest palindromic subsequence
        int len = lps(str); 
        
        // Returning the minimum number of deletions as the difference between the total string length and the length of the longest palindromic subsequence
        return (n - len); 
    }
}