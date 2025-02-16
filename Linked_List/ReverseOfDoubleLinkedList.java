package Linked_List;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class ReverseOfDoubleLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = createNode(arr);
        System.out.println("Original List:");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed List:");
        printList(head);
    }
    public static Node createNode(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        return head;
    }

    public static Node reverse(Node head) {
        Node temp = null;
        Node current = head;

       
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; 
        }


        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
