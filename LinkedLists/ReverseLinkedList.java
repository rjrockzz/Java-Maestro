public class ReverseLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static ReverseLinkedList insert(ReverseLinkedList list, int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
            return list;
        }
        Node temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
        return list;
    }
    public static void printList(ReverseLinkedList list){
        Node curr_node = list.head;
        while (curr_node!=null){
            System.out.print(curr_node.data + " -> ");
            curr_node = curr_node.next;
        }
        System.out.print("null");
    }

    public static ReverseLinkedList reverseLinkedList(ReverseLinkedList list){
        Node prev = null, curr_node = list.head, temp;
        while(curr_node!= null){
            temp = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        printList(list);
        reverseLinkedList(list);
        printList(list);

        /*
        WIP
         */
    }
}
