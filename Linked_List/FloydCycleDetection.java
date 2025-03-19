package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FloydCycleDetection {
    Node head;
    void createCycle(int pos) {
        if (head == null || pos == -1) return;

        Node temp = head;
        Node cycleNode = null;
        int index = 0;

        while (temp.next != null) {
            if (index == pos) {
                cycleNode = temp;  
            }
            temp = temp.next;
            index++;
        }

        temp.next = cycleNode;  
    }


    boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;  
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);

        list.createCycle(1); 

        System.out.println(list.hasCycle(list.head)); 
    }
}
