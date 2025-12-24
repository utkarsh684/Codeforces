class DoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void deleteNode(Node delNode) {
        if (head == null || delNode == null) {
            return;
        }

        if (head == delNode) {
            head = delNode.next;
        }

        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }

        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = head;
        if (temp == null) return;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(2);
        dll.insertAtEnd(30);

        System.out.println("Forward Traversal:");
        dll.printForward();

        System.out.println("Backward Traversal:");
        dll.printBackward();

        dll.insertAfter(dll.head.next, 15);
        System.out.println("After inserting 15 after second node:");
        dll.printForward();

        dll.deleteNode(dll.head.next); // delete node with 15
        System.out.println("After deletion:");
        dll.printForward();
    }
}

