class middle {
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        if (first == null) {
            first = temp;
            return;
        } else {
            current = first;
            while (current != null && current.data < temp.data) {
                previous = current;
                current = current.next;
            }
        }

        // First inserting
        if (current == null && previous == null && first != null) {
            temp.next = first;
            first = temp;
            return;
        }

        // Last inserting
        if (previous != null && current == null) {
            previous.next = temp;
            return;
        }

        // First inserting
        if (previous == null && current != null) {
            temp.next = current;
            current = temp;
            return;
        }

        // Middle inserting
        if (previous != null && current != null) {
            previous.next = temp;
            temp.next = current;
            return;
        }
    }

    static void delete() {
        if (current == null) {
            return;
        }
        if (previous == null) {
            first = current.next;
        } else {
            previous.next = current.next;
        }

        current.next = null;
        current = null;
    }
    static void deleteFirst() {
    if (first == null) {
        return; // List is empty, nothing to delete
    }

    Node temp = first; // Store the first node in a temporary variable
    first = first.next; // Update the first node to the next node
    temp.next = null; // Disconnect the old first node
}


    public static void display() {
        Node tempe = first;
        while (tempe != null) {
            System.out.print(tempe.data + " ");
            tempe = tempe.next;
        }
    }

    public static void main(String[] args) {
        middle.insert(1);
        middle.insert(2);
        middle.insert(8);
        middle.insert(5);
        middle.insert(4);
        middle.insert(3);
        middle.insert(9);
        middle.insert(6);
        middle.insert(10);
        middle.insert(7);

        // Commenting out the delete() call for now to ensure the correct display before deletion
        middle.delete();
        middle.deleteFirst();
        middle.insert(11);

        middle.display();
    }
}

class Node {
    int data;
    Node next;
}

