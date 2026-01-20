public class Practice {
    public static void main(String[] args) {
        // Node head = new Node('g', null);
        // Node ryan = new Node('s', null);
        // head.next = ryan;
        // ryan.next = new Node('t', null);
        // // ryan.next.next = new Node('x', null);
        
        // // Expect to print true
        // System.out.println(contains(head, 'x'));

        // // Expect to print false
        // System.out.println(contains(head, 'e'));

        // remove(head, 't');

        // printList(head);
        MyLL list = new MyLL();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');

        // list.printList();
        list.printListBackwards();

        MyLL<Integer> intList = new MyLL<>();

        intList.addToBack(5);
        intList.addToBack(777);
        intList.addToBack(2);
        intList.addToBack(-3333);
        intList.addToBack(99);


    }

    public static void printList(Node start) {
        Node current = start;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public static boolean contains(Node start, char toFind) {
        Node current = start;
        while (current != null) {
            if (current.value == toFind) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //remove the first node that has toRemove
    public static char remove(Node head, char toRemove) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
        current = current.next;
        }

        return '\0';
    }
}
