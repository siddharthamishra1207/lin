public class myclass {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
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
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (head == null) {
            head = newNode;
        } 
    
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    
    }
    //
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
              
                current = current.next;

            }
            current.next = newNode;
        }
    }

    public void deleteFromLast(){
        Node temp =head;
        while (temp.next!=null){
            temp = temp.next;
        }
        
    }
    public static void main(String[] args) {
        myclass ll = new myclass();
        ll.addFirst(10);
        ll.addFirst(20);
        // ll.addFirst(30);
         ll.add(50);
       ll.printll();
    }
}