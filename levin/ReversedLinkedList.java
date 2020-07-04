class ListNode {
    int data;
    ListNode next;
    
    ListNode(int data) {
        this.data = data;
    }
}

public class ReversedLinkedList {
    
    // 1->2->3
    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = head;
        while(head != null) {
            next = head.next;   // 2, 3, null
            head.next = prev;   // null, 1, 2
            prev = head;        // 1, 2, 3
            head = next;        // 2, 3, null
        } 
        return prev;
    }
    
    public static void print(ListNode head) {
        ListNode current = head;
        System.out.println(current.data);
        while(current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }        
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        System.out.println("List to reverse");
        print(head);
        System.out.println("Reversed List");
        print(reverse(head));
    }
}