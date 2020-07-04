public class StackList<Item> {

    private static class Node<Item> {
        Item data;
        Node next;
        Node(Item data) {
            this.data = data;
        }
    }
        
    private Node first;
    private int numItems;
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public int size() {
        return numItems;
    }
    
    public void push(Item data) {
        Node oldFirst = first;
        first = new Node(data);
        first.next = oldFirst;
        numItems++;
    }
    
    public Item pop() {
        Item item = first.data;
        first = first.next;
        numItems--;
        return item;
    }
    
    public String toString() {
        String str = "\nNumber of elements: " + numItems;
        Node current = first;
        while(current != null) {
            str = str + "\n" + current.data;
            current = current.next;
        } 
        return str;       
    }
        
    public static void main(String[] args) {
        StackList<Integer> stack = new StackList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.toString());
        
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());

    }
}

