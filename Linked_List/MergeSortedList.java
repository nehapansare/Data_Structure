package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MergeSortedList {
    public static void main(String[] args) {
        int arr1[]={1,2,4};
        int arr2[]={1,3,4};
        Node list1=createList(arr1);
        Node list2=createList(arr2);
        Node head=mergeList(list1,list2);
        printList(head);
    }
    public static Node createList(int arr[])
    {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static Node mergeList(Node list1,Node list2)
    {
        Node dummy=new Node(-1);
        Node curr=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.data<=list2.data)
            {
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1!=null)
        {
            curr.next=list1;
        }
        if(list2!=null)
        {
            curr.next=list2;
        }
        return dummy.next;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
