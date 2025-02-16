package Linked_List;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class palindromeOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,2,1};
        Node head = createList(arr);
        System.out.print("Original List: ");
        printList(head);

        boolean isPalindrome = checkPalindrome(head);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
    public static Node createList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }


public static boolean checkPalindrome(Node head)
{  Node mid=findMiddle(head);
    Node secondHalf=reverseList(mid);
    Node firstNode=head;
    Node temp=secondHalf;
    while(temp!=null)
    {
        if(firstNode.data!=temp.data)
        {
            return false;
        }
        firstNode=firstNode.next;
        temp=temp.next;

    }
    return true;

}

    public static Node findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }

  
    public static Node reverseList(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; 
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
