/* https://leetcode.com/problems/reverse-linked-list/ */

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseLinkedList {
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        System.out.println("Original LinkedList:");
        ListNode current = head;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        
        head = reverseList(head);
        
        System.out.println("Reversed LinkedList:");
        current = head;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }        
    }
}
