/**
 * Week 13-14 Handout, Queues, Question 2 Skeleton Code
 *
 * @author J. Collins, colli206@purdue.edu
 *
 */

public class MyQueue {
    private Node head;
    private Node tail;

    private class Node {
        String value;
        Node next;

        Node (String value) {
            this.value = value;
            this.next = null;
        }
    }

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue (String value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }


    public String dequeue () {
        Node current = head;
        head = current.next;
        return ;
    }
    
    public String peek() {
    	// TODO
    }

    public static void main(String [] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue("My");
        queue.enqueue("Name");
        queue.enqueue("Is");
        queue.enqueue("Inigo");
        queue.enqueue("Montoya");


        //To test dequeue() implementation
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
    }
}