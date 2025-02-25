package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortList {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 3};
        Node head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = sortList(head);  
        System.out.print("Sorted List: ");
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

    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;


        Node mid = middleNode(head);
        Node rightHead = mid.next;
        mid.next = null;  


        Node left = sortList(head);
        Node right = sortList(rightHead);

        return merge(left, right);
    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) temp.next = list1;
        if (list2 != null) temp.next = list2;

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
