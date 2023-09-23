public interface IQueue<T>{

    /*
     This function must help add or
     enqueue a value in the Queue.
     */
    public void enqueue(T value);

    /*
     This function must dequeue or
     remove the current first value
     */
    public T dequeue();

    /*
     This function returns the
     number of items in a queue.
     */
    public int size();
}