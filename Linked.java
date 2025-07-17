class Linked {

    Node head;

    public class Node {
        String data;
        Node next ;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printLL() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty");
            return;// no elements in the list to be deleted
        } else {
            head = head.next;
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

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        // Now, secondLast points to the second-to-last node
        secondLast.next = null; // Remove the reference to the last node
    }

    public void getSize() {
        int C = 1;
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            C++;
        }
        System.out.println(C);
    }

    public static void main(String[] args) {
        Linked ll = new Linked();
        ll.addFirst("hello");
        ll.printLL();
        ll.deleteFirst();
        // System.out.println("before");
        // ll.addFirst("this");
        // ll.addFirst("is");
        // ll.printLL();
        // System.out.println("after");
        // ll.addLast("a");
        // ll.printLL();

        // System.out.println("code runned!");
        // ll.printLL();
        // ll.getSize();
    }

}
