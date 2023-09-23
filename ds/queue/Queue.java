public class Queue<T> implements IQueue<T>{

    private Node first; //to point to the first node in the queue
    private Node last; //points to last member of the queue
    private int n = 0;
    private class Node{
        T value;
        Node next;
    }
    public int size(){
        return n;
    }

    public T dequeue(){
        Node oldFirst = first;
        first = first.next;
        n--;
        return oldFirst.value;
    }

    public void enqueue(T value) {
        // Create a new node with the given value
        Node current = new Node();
        current.value = value;

        if (first == null) {
            // If the queue is empty, make 'current' both the first and last node
            first = last = current;
        } else {
            // Otherwise, update the 'next' reference of the current last node
            last.next = current;
            last = current; // Make 'current' the new last node
        }
        n++;
    }


}