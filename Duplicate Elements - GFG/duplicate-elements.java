//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.SortedDuplicates(arr, n);
		    System.out.println();  // print the newline
		    
		}
	}
}




// } Driver Code Ends
//User function Template for Java

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        boolean flag = false;
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                if(map.get(arr[i]) < 2)
                {
                    System.out.print(arr[i]+" ");
                    map.put(arr[i],map.get(arr[i])+1);
                    flag = true;
                }
            }
                
            else
                map.put(arr[i],1);
        }
        
        if(!flag)
            System.out.print(-1);
        
        // for(Map.Entry<Integer,Integer> val : map.entrySet())
        // {
        //     if(val.getValue()>1)
        //         System.out.print(val.getKey()+" ");
        // }
     }
    
}
   

//{ Driver Code Starts.

// } Driver Code Ends