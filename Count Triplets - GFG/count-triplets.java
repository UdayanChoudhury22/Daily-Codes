//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
        
            Solve y = new Solve();
            System.out.println(y.countTriplets(head,x));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
    
}


// } Driver Code Ends


//User function Template for Java

class Solve
{
    static int countTriplets(Node head, int x) 
{ 
    Node ptr, ptr1, ptr2; 
    int count = 0; 
   
   
    HashMap<Integer,Node> um = new HashMap<Integer,Node>(); 
   
  
    for (ptr = head; ptr != null; ptr = ptr.next) 
        um.put(ptr.data, ptr); 
   
   
    for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next) 
        for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) { 
   
           
            int p_sum = ptr1.data + ptr2.data; 
   
            
            if (um.containsKey(x - p_sum) && um.get(x - p_sum) != ptr1 
                && um.get(x - p_sum) != ptr2) 
   
               
                count++; 
        } 
   
    
    return (count / 3); 
} 
}