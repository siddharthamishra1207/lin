public class Lin {
    Node head; 
    public class Node {
        String data;
        Node next;
    
        public Node(String data) {
            this.data = data;
            this.next = null; // Next is initially null since it's the only node at creation.
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; // Link the new node to the current head.
            head = newNode;       // Update head to be the new node.
        }
    }
    public void printLL() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next; // Move to the next node.
        }
        System.out.println("null"); // Marks the end of the list.
    }
    
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
    
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next; // Traverse to the last node.
        }
        currNode.next = newNode; // Link the last node to the new node.
    }
    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty");
            return; // List is already empty
        } else {
            head = head.next; // Update head to point to the second node.
        }
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return; // No elements in the list to be deleted
        }
    
        if (head.next == null) {
            head = null;
            return; // Only one element in the list, so remove it
        }
    
        Node currNode = head;
        while (currNode.next.next != null) {  // Check two nodes ahead
            currNode = currNode.next;
        }
    
        currNode.next = null;  // Disconnect the last node
    }
    // public void getSize() {
    //     int C = 1;
    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //         C++;
    //     }
    //     System.out.println(C);
    // }

    public void getSize() {
    int count = 0;
    Node currNode = head;
    while (currNode != null) {
        count++;
        currNode = currNode.next;
    }
    System.out.println(count);
}
    public boolean search(String key) {
        Node currNode = head; // Start from the head node
    
        while (currNode != null) {
            if (currNode.data.equals(key)) { // Check if current node's data matches the key
                return true; // Element found
            }
            currNode = currNode.next; // Move to the next node
        }
    
        return false; // Element not found after traversing the list
    }

    public static void main(String[] args) {
        Lin ll = new Lin();
        ll.addFirst("hello");
        ll.addLast("world");
        ll.addLast("java");
        ll.printLL();
    
        // Searching for an element in the linked list
        String key = "world";
        if (ll.search(key)) {
            System.out.println(key + " found in the list.");
        } else {
            System.out.println(key + " not found in the list.");
        }
    
        // Trying to search for an element that doesn't exist
        key = "java";
        if (ll.search(key)) {
            System.out.println(key + " found in the list.");
        } else {
            System.out.println(key + " not found in the list.");
        }
    }
    
}
