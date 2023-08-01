//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String Str = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.transform(Str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String str) 
    {
        // code here
        StringBuilder sb = new StringBuilder();
         str.toLowerCase();
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
              sb.append(str.charAt(i));                
            } 
            }
            String s = sb.toString();
            if(s.equals("")) {
                return "-1";
            }
            StringBuilder sb1 = new StringBuilder();
            for(int i=0; i<=s.length()-1; i++) {
                sb1.append('#');
            char ch1 = s.charAt(i);
            if(ch1 >= 'A' && ch1 <= 'Z') {
                sb1.append(Character.toLowerCase(ch1));
            } else {
                sb1.append(Character.toUpperCase(ch1));
            }
            }
        return sb1.toString();
    }
}