//{ Driver Code Starts
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
		    String res = obj.maximumFrequency(line);
		    
		    System.out.println(res);
		}
	}
}


            




// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static String maximumFrequency (String S) {
        //Complete the function
        HashMap<String,Integer> map=new HashMap<>();
        String[] str= S.split(" ");
        int max=0;
        for(int i=0;i<str.length;i++){
            if(map.containsKey(str[i])){
                int a=map.get(str[i]);
                a++;
                map.put(str[i],a);
            }else{
                map.put(str[i],1);
            }
            max=Math.max(max,map.get(str[i]));
        }
        if(max==1){
            String strr=str[0]+" "+Integer.toString(map.get(str[0]));
            return strr;
        }
        for(int i=0;i<str.length;i++){
            if(map.get(str[i])==max){
              String strr=str[i]+" "+Integer.toString(map.get(str[i]));
              return strr;
            }
        }
        return "-1";
    }
    
    
}