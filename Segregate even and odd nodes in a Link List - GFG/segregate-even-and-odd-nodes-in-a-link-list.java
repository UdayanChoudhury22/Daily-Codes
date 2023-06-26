//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        Node even_head = null;
        Node even_temp=null;
        
        Node odd_head = null;
        Node odd_temp = null;
        
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data % 2==0)
            {
                if(even_head == null)
                {
                    even_head = new Node(temp.data);
                    even_temp = even_head;
                }
                else
                {
                    even_temp.next = new Node(temp.data);
                    even_temp = even_temp.next;
                }
            }
            else
            {
                if(odd_head == null)
                {
                    odd_head = new Node(temp.data);
                    odd_temp = odd_head;
                }
                else
                {
                    odd_temp.next = new Node(temp.data);
                    odd_temp = odd_temp.next;
                }
            }
            temp = temp.next;
        }
        
        temp = head;
        even_temp = even_head;
        odd_temp = odd_head;
        
        while(even_temp!=null)
        {
            temp.data = even_temp.data;
            temp = temp.next;
            even_temp = even_temp.next;
        }
        
        while(odd_temp!=null)
        {
            temp.data = odd_temp.data;
            temp = temp.next;
            odd_temp = odd_temp.next;
        }
        
        return head;
    }
}