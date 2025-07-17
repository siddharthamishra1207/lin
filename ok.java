public class ok {
    Node head;  // Head of the linked list

    // Inner class representing a node in the linked list
    public class Node {
        int data;  // Data to store
        Node next; // Reference to the next node in the list

        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.next = null; // Initially, the node does not point to any other node
        }
    }

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            newNode.next = head; // Point the new node to the current head
            head = newNode;      // Update the head to be the new node
        }
    }

    // Method to print the linked list
    public void printll() {
        Node temp = head; // Start from the head of the list
        while (temp != null) {
            System.out.print(temp.data + "->"); // Print the data in the current node
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the end of the list
            }
            temp.next = newNode; // Point the last node to the new node
        }
    }

    // Method to delete the last node in the list
    public void deleteFromLast() {
        if (head == null) {
            System.out.println("null"); // If the list is empty, print "null"
        } else if (head.next == null) {
            head = null; // If there's only one node, set the head to null
            System.out.println("null"); // Print "null" to indicate the list is now empty
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next; // Traverse to the second-to-last node
            }
            temp.next = null; // Remove the reference to the last node
        }
    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        ok ll = new ok(); // Create a new linked list
        ll.addFirst(10); // Add 10 at the beginning of the list
        ll.addFirst(30); // Add 30 at the beginning of the list
        ll.addLast(60);  // Add 60 at the end of the list
        ll.printll();    // Print the list to show the result
        ll.deleteFromLast();
         ll.printll();
    }
}
/*----------------------------------------------------------------
When to Use Each Condition:
temp != null: Use this when you want to iterate over the entire list or check if the list is empty.
temp.next != null: Use this when you want to stop at the last node or perform operations like adding or removing a node from the end.
temp.next.next != null: Use this when you need to stop before the second-last node, for example, when you want to delete the last node.
-------------------------------------------------------------------------------*/