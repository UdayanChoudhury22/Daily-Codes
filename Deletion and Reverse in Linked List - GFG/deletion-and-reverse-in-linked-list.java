//{ Driver Code Starts
import java.util.Scanner;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class GFG1 {
    public static void printList(Node head)
    {
        Node start=head;
        System.out.print(head.data+" ");
        head=head.next;
        while(head!=start)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        Node start=null,cur=null;
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            Node ptr=new Node(a);
	            if(start==null)
	            {
	                start=ptr;
	                cur=ptr;
	            }
	            else
	            {
	                cur.next=ptr;
	                cur=ptr;
	            }
	        }
	        int delNode=sc.nextInt();
	        cur.next=start;
	        GFG obj=new GFG();
	        Node head=obj.deleteNode(start,delNode);
	        start=obj.reverse(head);
	        printList(start);
	    }
	}
}
// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class GFG
{
    //This method returns the head of the LL after deleting node with value d.
     public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node curr=head;
        Node curr1=null;
        Node next = null;
        while(curr.next.data!=d){
            curr=curr.next;
        }
        int f=0;
        if(head.data==d){
            f=1;
        }
        next = curr.next;
        curr.next = next.next;
        curr1 = next.next; 
        next.next=null;
        if(f==1){
            return curr1;
        }
        else{
            return head;
        }
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        Node prev=head;
        Node curr=head;
        Node next=null;
        while(prev.next!=head){
            prev=prev.next;
        }
        while(next!=head){
            next =curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;
    }
}



/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

// class GFG
// {
//     //This method returns the head of the LL after deleting node with value d.
//     public static Node deleteNode(Node head,int d)
//     {
//         //Add your code here.
//         Node curr=head;
//         Node curr1=null;
//         Node next = null;
//         while(curr.next.data!=d){
//             curr=curr.next;
//         }
//         int f=0;
//         if(head.data==d){
//             f=1;
//         }
//         next = curr.next;
//         curr.next = next.next;
//         curr1 = next.next; 
//         next.next=null;
//         if(f==1){
//             return curr1;
//         }
//         else{
//             return head;
//         }
//     }
//     //This method returns the head node of the reversed Linked list.
//     public static Node reverse(Node head)
//     {
//         //Add your code here
//         Node prev=head;
//         Node curr=head;
//         Node next=null;
//         while(prev.next!=head){
//             prev=prev.next;
//         }
//         while(next!=head){
//             next =curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr = next;
//         }
//         return prev;
//     }
// }