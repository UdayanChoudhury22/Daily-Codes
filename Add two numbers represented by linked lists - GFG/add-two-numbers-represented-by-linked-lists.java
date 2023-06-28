//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to reverse the linked list.
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null)
        {
            next = curr.next;     
            curr.next = prev;     
            prev = curr;          
            curr = next;        
        }
        
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        
        //reversing both lists to simplify addition.
        first = reverse(first);      
        second = reverse(second);     
        
        Node sum = null;
        int carry = 0;
        
        //using a loop till both lists and carry gets exhausted.
        while( first!=null || second!=null || carry>0 )
        {
            //using a variable to store sum of two digits along with carry.
            int newVal = carry;
            
            //if nodes are left in any list, we add their data in newVal.
            if(first!=null) newVal+=first.data;
            if(second!=null) newVal+=second.data;
            
            //updating carry.
            carry = newVal / 10;
            
            //using modulus to store only a single digit at that place.
            newVal = newVal % 10;
            
            //creating new node which gets connected with other nodes that 
            //we get after calculating sum of respective digits.
            Node newNode = new Node(newVal);
            
            //storing the previously made nodes in the link part of new node.
            newNode.next = sum;
            //making the new node as the first node of all previously made node.
            sum = newNode;
            
            //moving ahead in both lists.
            if(first!=null) first = first.next;      
            if(second!=null) second = second.next;
        }
        
        return sum;
    }
}