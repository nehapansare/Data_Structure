package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.next = null;
        this.data = data;
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 2;

        Node head = createList(arr);
        System.out.print("original:");
        printList(head);
        head = removeNode(head, n);
        printList(head);  
    }

    public static Node createList(int arr[]) {
        if (arr.length == 0) return null; 

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static Node removeNode(Node head, int n) {  
        Node dummy = new Node(-1);
        dummy.next = head;
        Node firstNode = dummy;
        Node secondNode = dummy;

        for (int i = 0; i <= n; i++) {
            if (secondNode == null) return head;
            secondNode = secondNode.next;
        }
        while (secondNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        firstNode.next = firstNode.next.next;
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
