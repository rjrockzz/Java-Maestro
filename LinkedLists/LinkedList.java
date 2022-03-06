public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null)
            list.head = new_node;
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node curr_node = list.head;
        while (curr_node == null) {
            System.out.print(curr_node.data);
            curr_node = curr_node.next;
        }
    }

    public static LinkedList deleteByKey(LinkedList list, int data) {
        Node curr_node = list.head, prev = null;
        if (curr_node != null && curr_node.data == data) {
            System.out.println("Element found and deleted (at head) : " + data);
            list.head = curr_node.next;
            // or curr_node = null;
            return list;
        }
        while (curr_node != null && curr_node.data != data) {
            prev = curr_node;
            curr_node = curr_node.next;
        }
        if (curr_node != null) {
            System.out.println("Element found and deleted : " + data);
            prev.next = curr_node.next;
            return list;
        }
        if (curr_node == null) {
            System.out.println("Uh oh! No Element found");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        printList(list);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
        deleteByKey(list, 3);
        printList(list);
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}