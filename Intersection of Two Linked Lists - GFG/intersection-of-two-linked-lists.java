//{ Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/
/*
class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> set1 = new LinkedHashSet<>();
        HashSet<Integer> set2 = new LinkedHashSet<>();
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null)
        {
            set1.add(temp1.data);
            temp1 = temp1.next;
        }
        Node head3 = null,tail3 = null;
        while(temp2!=null)
        {
            if(set1.contains(temp2.data))
            {
                if(head3==null)
                {
                    head3 = tail3 = new Node(temp2.data);
                }
                else
                {
                    tail3.next = new Node(temp2.data);
                    tail3 = tail3.next;
                }
            }
            temp2 = temp2.next;
        }
        return head3;
    }
}
*/


class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> st = new HashSet<Integer>();
        while(head2!=null)
        {
            st.add(head2.data);
            head2 = head2.next;
        }
        
        Node newHead=null, newTail=null;
        
        while(head1!=null)
        {
            if( st.contains(head1.data) )
            {
                if(newHead==null)
                    newHead = newTail = new Node(head1.data);
                else
                {
                    newTail.next = new Node(head1.data);
                    newTail = newTail.next;
                }
            }
            head1 = head1.next;
        }
        
        return newHead;
        
    }
}
