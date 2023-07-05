//{ Driver Code Starts
import java.util.*;
import java.lang.*;

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

class SortLL
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    public static void swap(Node temp1,Node temp2)
 {
 int Data=temp1.data;
 temp1.data=temp2.data;
 temp2.data=Data;
 }
 public static Node pivotElement(Node start,Node end)
 {
 if(start==end || start==null || start==end.next) return start;
 int pivot=end.data;
 Node prevPivot=start;
 Node tmp=start;
 
 while(start!=end)
 {
 if(start.data<pivot)
 {
 swap(tmp,start);
 prevPivot=tmp;
 tmp=tmp.next;
 }
 start=start.next;
 }
 swap(tmp,end);
 return prevPivot;
 }
 public static void QuickSortImplementation(Node start,Node end)
 {
 if(start==end || start==null || start==end.next) return;
 Node prevPivot=pivotElement(start,end);
 
 QuickSortImplementation(start,prevPivot);
 if(prevPivot == start)
            QuickSortImplementation(prevPivot.next, end);
        else if(prevPivot.next != null)
            QuickSortImplementation(prevPivot.next.next,end);
 }
    
    
    public static Node quickSort(Node head)
    {
        if(head==null || head.next==null) return head;
        
        Node start=head;
        Node end=head;
        while(end.next!=null)
        {
            end=end.next;
        }
        QuickSortImplementation(start,end);
     
        
        return head;
        
    }
    
    
}