//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    public static Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
           return head;
        
        //splitting the list into two halves.   
        Node mid = findMid(head);
        Node head2= mid.next;
        mid.next = null;
        
        //calling the mergeSort function recursively for both parts separately.
        Node left = mergeSort(head);
        Node right = mergeSort(head2);
        
        //calling the function to merge both halves.
        Node res = merge(left, right);
        return res;
        
    }
    
    //Function to merge two halves of list.
    public static Node merge(Node left, Node right)
    {
        Node ans = null;
        
        //base cases when either of two halves is null.
        if (left == null)
            return right;
        if (right == null)
            return left;
 
        //comparing data in both halves and storing the smaller in result and
        //recursively calling the mergeList function for next node in result.
        if (left.data <= right.data) 
        {
            ans = left;
            ans.next = merge(left.next, right);
        } 
        else
        {
            ans = right;
            ans.next = merge(left, right.next);
        }
        
        //returning the resultant list.
        return ans;
    }
    
    //Function to split the list into two halves.
    public static Node findMid(Node head)
    {
        if (head == null)
            return head;
            
        //using two pointers to find the midpoint of list.
        Node fast = head.next;
        Node slow = head;
         
        //first pointer, slow moves 1 node and second pointer, fast moves
        //2 nodes in one iteration.
        while (fast != null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
        }
        //slow is before the midpoint in the list, so we split the 
        //list in two halves from that point.
        return slow;
    }

}

