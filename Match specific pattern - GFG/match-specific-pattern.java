//{ Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}
// } Driver Code Ends


/*Complete the provided function*/

class GfG
{

public static String encode(String str){
    
    HashMap<Character, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0 ; i < str.length() ; i++){
        
        char ch = str.charAt(i);
        
        if(map.containsKey(ch) == false){
            map.put(ch, i);
        }
        
        sb.append(map.get(ch));
    }
    
    return sb.toString();
}
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String> list = new ArrayList<>();
	    
	    String phash = encode(pattern);
	    
	    for(int i = 0 ; i < dict.size() ; i++){
	        
	        String str = dict.get(i);
	        String shash = encode(str);
	        
	        if(pattern.length() == str.length() && phash.equals(shash)){
	            list.add(str);
	        }
	    }
	    return list;
	}
}