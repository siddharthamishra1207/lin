public class Chup {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void deletefirst() {
        if (head == null) {
            System.out.print("empty");
        }
        head = head.next;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
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

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        // Now, secondLast points to the second-to-last node
        secondLast.next = null; // Remove the reference to the last node
    }
    
    public static void main(String[] args) {
        Chup ll = new Chup();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.printll();
        System.out.println();
        ll.addlast(7);
        ll.addFirst(60);
        ll.printll();
        ll.deleteLast();
        System.out.println();
        ll.printll();
    }
}
