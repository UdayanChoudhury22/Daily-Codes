//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// a node of the doubly linked list
class DLLNode
{
public:
    int data;
    DLLNode *next;
    DLLNode *prev;
    DLLNode(int val)
    {
        data = val;
        this->next = NULL;
        this->prev = NULL;
    }
};


// } Driver Code Ends
//User function Template for C++

/*
// a node of the doubly linked list
class DLLNode
{
public:
    int data;
    DLLNode *next;
    DLLNode *prev;
    DLLNode(int val)
    {
        data = val;
        this->next = NULL;
        this->prev = NULL;
    }
};
*/
class Solution
{
public:
    // function to sort a k sorted doubly linked list
    DLLNode *sortAKSortedDLL(DLLNode *head, int k)
    {
        if (head == NULL || head->next == NULL)
            return head;

        // perform on all the nodes in list
        for (DLLNode *i = head->next; i != NULL; i = i->next)
        {
            DLLNode *j = i;
            // There will be atmost k swaps for each element in the list
            // since each node is k steps away from its correct position
            while (j->prev != NULL && j->data < j->prev->data)
            {
                // swap j and j.prev node
                DLLNode *temp = j->prev->prev;
                DLLNode *temp2 = j->prev;
                DLLNode *temp3 = j->next;
                j->prev->next = temp3;
                j->prev->prev = j;
                j->prev = temp;
                j->next = temp2;
                if (temp != NULL)
                    temp->next = j;
                if (temp3 != NULL)
                    temp3->prev = temp2;
            }
            // if j is now the new head
            // then reset head
            if (j->prev == NULL)
                head = j;
        }
        return head;
    }
};

//{ Driver Code Starts.

// Function to insert a node at the end
// of the Doubly Linked List
void push(DLLNode **tailRef, int new_data)
{
    // allocate node
    DLLNode *newNode = new DLLNode(new_data);

    // since we are adding at the end,
    // next is NULL
    newNode->next = NULL;

    newNode->prev = (*tailRef);

    // change next of tail node to new node
    if ((*tailRef) != NULL)
        (*tailRef)->next = newNode;

    (*tailRef) = newNode;
}

// Function to print nodes in a given doubly linked list
void printList(DLLNode *head)
{
    // if list is empty
    if (head == NULL)
        return;

    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
}

// Driver
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        int a;
        cin >> a;
        DLLNode *head = new DLLNode(a);
        DLLNode *tail = head;
        for (int i = 0; i < n - 1; i++)
        {
            cin >> a;
            push(&tail, a);
        }
        Solution obj;
        printList(obj.sortAKSortedDLL(head, k));
        cout << "\n";
    }

    return 0;
}

// } Driver Code Ends