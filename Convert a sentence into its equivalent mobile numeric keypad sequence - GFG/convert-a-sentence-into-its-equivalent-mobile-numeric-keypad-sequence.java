//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        String s="";

        for(int i=0;i<S.length();i++){

            char c=S.charAt(i);

            switch(c){

               case 'A': s+="2";

               continue;

               case 'B': s+="22";

               continue;

               case 'C': s+="222";

               continue;

               case 'D': s+="3";

               continue;

               case 'E': s+="33";

               continue;

               case 'F': s+="333";

               continue;

               case 'G': s+="4";

               continue;

               case 'H': s+="44";

               continue;

               case 'I': s+="444";

               continue;

               case 'J': s+="5";

               continue;

               case 'K': s+="55";

               continue;

               case 'L': s+="555";

               continue;

               case 'M': s+="6";

               continue;

               case 'N': s+="66";

               continue;

               case 'O': s+="666";

               continue;

               case 'P': s+="7";

               continue;

               case 'Q': s+="77";

               continue;

               case 'R': s+="777";

               continue;

               case 'S': s+="7777";

               continue;

               case 'T': s+="8";

               continue;

               case 'U': s+="88";

               continue;

               case 'V': s+="888";

               continue;

               case 'W': s+="9";

               continue;

               case 'X': s+="99";

               continue;

               case 'Y': s+="999";

               continue;

               case 'Z': s+="9999";

               continue;

               case ' ': s+="0";

               continue;

            }

        }

        return s;
    }
}