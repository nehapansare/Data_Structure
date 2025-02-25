package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class EvenOddLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = createList(arr); 

        head = EvenOdd(head); 

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

    public static Node EvenOdd(Node head) { 
        if (head == null || head.next == null) return head; 

        Node odd = head;
        Node even = head.next;
        Node evenStart = even; 

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenStart; 
        return head;
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
