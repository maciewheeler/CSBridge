/**
 * Dynamic Data Structures Tutorial Skeleton Code
 *
 * @author J. Collins, colli206@purdue.edu
 *
 */

public class MyLinkedList {
    private Node head;
    private int size;

    private class Node {
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
            this.next = null;
            size++;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(String value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }

    public int getSize() {
        return size;
    }

    void printList() {
        Node current = head;
        System.out.print("Linked List (size " + getSize() + "): ");
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    String remove() {
        Node current = head;
        head = current.next;
        return current.value;

    }


    public static void main(String args[]) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("Jane");
        linkedList.add("is");
        linkedList.add("Name");
        linkedList.add("My");
        linkedList.add("Hello");

        linkedList.printList();

        String temp = linkedList.remove();
        linkedList.printList();
        temp = linkedList.remove();
        linkedList.printList();
        temp = linkedList.remove();
        linkedList.printList();
        temp = linkedList.remove();
        linkedList.printList();
        temp = linkedList.remove();
        linkedList.printList();
    }

}